package com.hand.serviceProvider.controller;

import com.hand.serviceProvider.domain.User;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @version: 1.0
 * @author: xiantao.han@hand-china.com
 * @Date: 2019/6/29
 */
@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello1")
    public String hello(@RequestParam String name) {
        return "Hello" + name;
    }

    @GetMapping("/hello2")
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
        return new User(name, age);
    }

    @PostMapping("/hello3")
    public String hello(@RequestBody User user) {
        return "Hello" + user.getName() + "," + user.getAge();
    }

}
