package com.cowboy.book;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
public class AdminServer8600 {
    public static void main(String[] args) {
        SpringApplication.run(AdminServer8600.class, args);
    }
}
