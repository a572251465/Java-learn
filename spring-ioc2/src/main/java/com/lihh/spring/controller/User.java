package com.lihh.spring.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component(value = "user1")
public class User {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
