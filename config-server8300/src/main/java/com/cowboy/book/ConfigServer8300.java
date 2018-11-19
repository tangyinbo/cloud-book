package com.cowboy.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServer8300 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer8300.class, args);
    }
}
