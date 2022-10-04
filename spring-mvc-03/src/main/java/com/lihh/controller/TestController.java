package com.lihh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
    @RequestMapping(value = "getName", method = RequestMethod.GET)
    public String getName() {
        return "my";
    }

    @RequestMapping(value = "getAge", method = {RequestMethod.GET, RequestMethod.POST})
    public String getAge() {
        return "my";
    }
}
