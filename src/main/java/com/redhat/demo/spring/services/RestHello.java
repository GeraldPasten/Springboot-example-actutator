package com.redhat.demo.spring.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHello {

    @GetMapping("/hello") 
    public String greetings() {
        return "Hello";
    }

}
