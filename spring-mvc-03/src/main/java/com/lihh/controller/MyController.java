package com.lihh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("myController")
@Controller
public class MyController {
    @RequestMapping("getName")
    public String getName() {
        return "my";
    }
}
