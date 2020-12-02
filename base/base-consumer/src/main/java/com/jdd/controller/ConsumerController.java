package com.jdd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer")
    public String helloWorld(String s){
        System.out.println("传入的值为："+s);
        String forObject = restTemplate.getForObject("http://base-provider/order/helloWorld?s=" + s, String.class);
        return forObject;
    }


}
