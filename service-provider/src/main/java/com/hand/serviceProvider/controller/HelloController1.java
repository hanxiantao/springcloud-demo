package com.hand.serviceProvider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @version: 1.0
 * @author: xiantao.han@hand-china.com
 * @Date: 2019/7/13
 */
@RestController
public class HelloController1 {
    @GetMapping("/hello")
    public String hello() {
        return "hello world111111";
    }
}
