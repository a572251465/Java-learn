package com.lihh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test1Controller {
    @RequestMapping(value = "getName", params = {"password", "username!=root"})
    public String getName() {
        return "my";
    }
}
