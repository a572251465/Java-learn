package com.lihh.controller;

import com.lihh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void addUser(String name, Integer age) {
        System.out.println("controller impl addUser");

        userService.addUser(name, age);
    }
}
