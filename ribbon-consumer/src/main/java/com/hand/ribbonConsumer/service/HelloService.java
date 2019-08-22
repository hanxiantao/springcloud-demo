package com.hand.ribbonConsumer.service;

import com.hand.ribbonConsumer.domain.User;
import com.hand.ribbonConsumer.exception.BadRequestException;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheRemove;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheResult;
import com.netflix.hystrix.contrib.javanica.command.AsyncResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Future;

/**
 * @description:
 * @version: 1.0
 * @author: xiantao.han@hand-china.com
 * @Date: 2019/7/11
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

//    @HystrixCommand(fallbackMethod = "helloFallbak", commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")})
//    public String helloService() {
//        return restTemplate.getForEntity("http://HELLO-SERVICE/hello?name={1}", String.class, "tom").getBody();
//    }
//
//    public String helloFallbak() {
//        return "error";
//    }

    @HystrixCommand(commandKey = "helloKey", threadPoolProperties = {@HystrixProperty(name = "maxQueueSize", value = "-1")})
    public User getUserById(Integer id) {
        return restTemplate.getForEntity("http://HELLO-SERVICE/user/{1}", User.class, id).getBody();
    }

    public User defaultUser(Integer id) {
        return new User();
    }

    @HystrixCommand
    public Future<User> getUserByIdAsync(Integer id) {
        return new AsyncResult<User>() {
            @Override
            public User invoke() {
                return restTemplate.getForEntity("http://HELLO-SERVICE/user/{1}", User.class, id).getBody();
            }
        };
    }
}
