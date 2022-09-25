package com.lihh.dao.impl;

import com.lihh.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser(String name, Integer age) {
        System.out.println(name + age);
        System.out.println("dao impl addUser");
    }
}
