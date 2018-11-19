package com.cowboy.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp8100 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApp8100.class, args);
    }
}
