package com.hand.feign.fallback;

import com.hand.feign.client.HelloService;
import com.hand.feign.domain.User;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @version: 1.0
 * @author: xiantao.han@hand-china.com
 * @Date: 2019/7/13
 */
@Component
public class HelloServiceFallback implements HelloService {
    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public User hello(String name, Integer age) {
        return new User("未知", 0);
    }

    @Override
    public String hello(User user) {
        return "error";
    }
}
