package com.lihh.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestHandController {
    @RequestMapping(value = "editUser/{name}", method = RequestMethod.POST)
    public String addUser(@PathVariable("name") String name) {
        return "my";
    }

    @RequestMapping(value = "editUser/{name}", method = RequestMethod.DELETE)
    public String delUser(@PathVariable("name") String name) {
        return "my";
    }

    @RequestMapping(value = "editUser/{name}", method = RequestMethod.PUT)
    public String updateUser(@PathVariable("name") String name) {
        return "my";
    }

    @RequestMapping(value = "editUser/{name}", method = RequestMethod.GET)
    public String getUser(@PathVariable("name") String name) {
        return "my";
    }
}
