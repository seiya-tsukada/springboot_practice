package com.example.sampleproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SampleController {

    @RequestMapping("/")
    public String index() {
        return "sample";
    }
}