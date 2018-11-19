package com.cowboy.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableEurekaClient

public class EurekaClient8200 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClient8200.class, args);
    }
}
