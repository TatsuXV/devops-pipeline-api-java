package com.devapi.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello mundo";
    }

    @GetMapping("/health")
    public String health(){
        return "UP";
    }
}
