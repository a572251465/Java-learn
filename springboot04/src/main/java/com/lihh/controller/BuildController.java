package com.lihh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BuildController {

    @ResponseBody
    @RequestMapping(value = "/buildController")
    public String buildController() {
        System.out.println("buildController");
        return "buildController";
    }
}
