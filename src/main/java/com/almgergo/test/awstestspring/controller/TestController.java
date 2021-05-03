package com.almgergo.test.awstestspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String hello() {
        return "Hello Root 14!";
    }

    @RequestMapping("/hello")
    public String index() {
        return "Greetings from Spring Boot 14!";
    }

}
