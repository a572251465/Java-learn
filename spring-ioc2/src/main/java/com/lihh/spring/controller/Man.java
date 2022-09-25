package com.lihh.spring.controller;

import org.springframework.stereotype.Controller;

@Controller
public class Man {
    private String name;

    public Man() {
    }

    public Man(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Man{" +
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
