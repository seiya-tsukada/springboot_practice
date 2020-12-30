package com.example.sampleproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleRestController {

    @GetMapping("/get")
    public String get(@RequestParam(value = "message", defaultValue = "Message") String message) {
        return message;
    }

}