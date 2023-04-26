package com.bookstore.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class DefaultController {

    @Value("${server.port}")
    private String port;

    @GetMapping
    public String home() {
        return "Server is listening at port " + port;
    }
}
