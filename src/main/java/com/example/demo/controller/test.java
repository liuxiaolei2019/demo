package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class test {
    @GetMapping("/test")
    public String putUserInfo() {





        return "太和车联网到来";
    }
}
