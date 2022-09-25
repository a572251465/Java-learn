package com.lihh.service.impl;

import com.lihh.dao.UserDao;
import com.lihh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(String name, Integer age) {
        System.out.println(name + age);
        System.out.println("service impl addUser");

        userDao.addUser(name, age);
    }
}
