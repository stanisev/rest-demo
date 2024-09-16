package com.stanisev.restapi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/home")
public class RestController {

    @GetMapping
    String get() {
        return "Hello";
    }

}
