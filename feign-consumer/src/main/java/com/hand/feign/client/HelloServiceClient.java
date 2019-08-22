package com.hand.feign.client;

import com.hand.helloservice.api.HelloService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @description:
 * @version: 1.0
 * @author: xiantao.han@hand-china.com
 * @Date: 2019/7/27
 */
@FeignClient(value = "hello-service")
public interface HelloServiceClient extends HelloService {
}
