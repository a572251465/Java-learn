package com.lihh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lihh")
@Controller
public class FirstController {
    @RequestMapping("/firstController")
    public String FirstController() {
        System.out.println("FirstController");
        return "first";
    }
}
