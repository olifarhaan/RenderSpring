package com.olifarhaan.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {
    
    @GetMapping
    public Map<String, String> test() {
        return Map.of("message", "Hello from Ali Farhan");
    }
}
