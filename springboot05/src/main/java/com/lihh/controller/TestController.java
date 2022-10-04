package com.lihh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping(value = "/showIndex")
    public String testController() {
        System.out.println("test controller");
        return "index";
    }
}
