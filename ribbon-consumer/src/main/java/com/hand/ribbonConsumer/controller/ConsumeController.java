package com.hand.ribbonConsumer.controller;

import com.hand.ribbonConsumer.domain.User;
import com.hand.ribbonConsumer.exception.BadRequestException;
import com.hand.ribbonConsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @version: 1.0
 * @author: xiantao.han@hand-china.com
 * @Date: 2019/6/29
 */
@RestController
public class ConsumeController {
    @Autowired
    HelloService helloService;

    @GetMapping("/ribbon-consumer")
    public User helloConsumer() {
        return helloService.getUserById(1);
    }
}
