package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class test {
    @GetMapping("/putUserInfo")
    public String putUserInfo() {





        return "XX大死鬼";
    }
}
