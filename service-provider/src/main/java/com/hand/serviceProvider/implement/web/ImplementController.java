package com.hand.serviceProvider.implement.web;

import com.hand.helloservice.api.HelloService;
import com.hand.helloservice.domain.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @version: 1.0
 * @author: xiantao.han@hand-china.com
 * @Date: 2019/7/27
 */
@RestController
public class ImplementController implements HelloService {
    @Override
    public String hello1(@RequestParam String name) {
        return "Hello" + name;
    }

    @Override
    public String hello2(@RequestBody User user) {
        return "Hello" + user.getName() + "," + user.getAge();
    }
}
