package com.hand.apigateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @version: 1.0
 * @author: xiantao.han@hand-china.com
 * @Date: 2019/7/14
 */
@RestController
public class HelloController {
    @RequestMapping("/local/hello")
    public String hello() {
        return "hello world";
    }
}
