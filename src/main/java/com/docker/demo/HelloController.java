package com.docker.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "Hello from Docker + Spring Boot 🚀";
    }
}
