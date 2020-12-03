package com.jdd.rpc;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "base-feign-provider")
public interface Demo {

    @RequestMapping(value = "/hi")
    String orderDemo(String s);


}
