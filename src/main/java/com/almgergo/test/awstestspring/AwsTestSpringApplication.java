package com.almgergo.test.awstestspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsTestSpringApplication {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000);
        SpringApplication.run(AwsTestSpringApplication.class, args);
    }

}
