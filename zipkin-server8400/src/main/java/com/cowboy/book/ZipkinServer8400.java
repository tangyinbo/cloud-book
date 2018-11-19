package com.cowboy.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipkinServer8400 {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinServer8400.class, args);
    }
}
