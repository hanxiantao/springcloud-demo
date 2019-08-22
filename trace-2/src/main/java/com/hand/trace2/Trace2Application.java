package com.hand.trace2;

import brave.sampler.Sampler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class Trace2Application {
    private final Logger logger = LoggerFactory.getLogger(Trace2Application.class);

    @GetMapping("/trace-2")
    public String trace(HttpServletRequest request) {
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()){
            System.out.println(headerNames.nextElement());
        }
        logger.info("==call trace-2==");
        return "Trace";
    }

    @Bean
    public Sampler defaultSampler() {
        return new Sampler() {
            @Override
            public boolean isSampled(long traceId) {
                return true;
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(Trace2Application.class, args);
    }

}
