package com.example.ApiJwt10.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping({ "/hello" })
    public String firstPage() {
        return "Logged in successfully";
    }
}
