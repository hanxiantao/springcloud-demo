package com.hand.feign.client;

import com.hand.feign.config.FullLogConfiguration;
import com.hand.feign.domain.User;
import com.hand.feign.fallback.HelloServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @version: 1.0
 * @author: xiantao.han@hand-china.com
 * @Date: 2019/7/13
 */
//@FeignClient(value = "hello-service", path = "/api", configuration = FullLogConfiguration.class, fallback = HelloServiceFallback.class)
public interface HelloService {
    @GetMapping("/hello1")
    String hello(@RequestParam("name") String name);

    @GetMapping("/hello2")
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @PostMapping("/hello3")
    String hello(@RequestBody User user);
}
