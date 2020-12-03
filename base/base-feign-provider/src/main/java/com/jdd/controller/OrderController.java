package com.jdd.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @RequestMapping(value = "/hi")
    public  String orderDemo(@RequestBody  String s){
        System.out.println("接受者"+s);
        return s;
    }
}
