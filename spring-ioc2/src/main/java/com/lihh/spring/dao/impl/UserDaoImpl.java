package com.lihh.spring.dao.impl;

import com.lihh.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("这是持久层的dao");
    }
}
