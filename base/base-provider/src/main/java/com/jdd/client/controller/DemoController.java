package com.jdd.client.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class DemoController {

    @RequestMapping("/helloWorld")
    public String helloWorld(String s){
        System.out.println("消费端的值为："+s);
        return "传入的值为："+s;
    }
}
