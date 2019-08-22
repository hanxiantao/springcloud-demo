package com.hand.feign.controller;

import com.hand.feign.client.HelloServiceClient;
import com.hand.helloservice.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @version: 1.0
 * @author: xiantao.han@hand-china.com
 * @Date: 2019/7/13
 */
@RestController
@RequestMapping("/api")
public class ConsumerController {
    @Autowired
    HelloServiceClient helloServiceClient;

    @GetMapping("/feign-consumer1")
    public String helloConsumer1() {
        return helloServiceClient.hello1("tom");
    }

    @GetMapping("/feign-consumer2")
    public String helloConsumer2() {
        return helloServiceClient.hello2(new User("tom", 11));
    }
}
