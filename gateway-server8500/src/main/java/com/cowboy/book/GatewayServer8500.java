package com.cowboy.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class GatewayServer8500 {
    public static void main(String[] args) {
        SpringApplication.run(GatewayServer8500.class, args);
    }
}
