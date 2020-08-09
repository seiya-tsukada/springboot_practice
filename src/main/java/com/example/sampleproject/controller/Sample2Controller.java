package com.example.sampleproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class Sample2Controller {

    @RequestMapping("/sample")
    public String sample() {
        return "sample";
    }

    @RequestMapping("/get")
    public String get(@RequestParam() String message) {
        return message;
    }

}