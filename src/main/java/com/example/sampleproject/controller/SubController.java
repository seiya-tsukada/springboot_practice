package com.example.sampleproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class SubController {

    @RequestMapping("/sub")
    public String sub(Model model) {
        model.addAttribute("message", "Hello argument!!");
        return "sub";
    }

}