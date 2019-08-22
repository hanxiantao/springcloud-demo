package com.hand.helloservice.api;

import com.hand.helloservice.domain.User;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @version: 1.0
 * @author: xiantao.han@hand-china.com
 * @Date: 2019/7/27
 */
@RequestMapping("/api/hello-service")
public interface HelloService {
    @GetMapping("/hello1")
    String hello1(@RequestParam String name);

    @PostMapping("/hello2")
    String hello2(@RequestBody User user);

}
