package com.jdd.controller;

import com.jdd.rpc.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private Demo demo;
    @RequestMapping(value = "/hello")
    public  String orderDemo(String s){
       s= demo.orderDemo(s);
       System.out.println(s);
        return s;
    }
}
