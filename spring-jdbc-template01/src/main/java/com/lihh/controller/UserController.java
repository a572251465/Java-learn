package com.lihh.controller;

import com.lihh.bean.User;
import com.lihh.com.lihh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public int userCount() {
        return userService.userCount();
    }

    public int userAdd(User user) {
        return userService.userAdd(user);
    }

    public int userUpdate() {
        return userService.userUpdate();
    }

    public int userDelete(Integer id) {
        return userService.userDelete(id);
    }

    public User queryUserById(Integer id) {
        return userService.queryUserById(id);
    }
}
