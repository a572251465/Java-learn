package com.lihh.com.lihh.service.impl;

import com.lihh.bean.User;
import com.lihh.com.lihh.service.UserService;
import com.lihh.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int userCount() {
        return userDao.userCount();
    }

    @Override
    public int userAdd(User user) {
        return userDao.userAdd(user);
    }

    @Override
    public int userUpdate() {
        return userDao.userUpdate();
    }

    @Override
    public int userDelete(Integer id) {
        return userDao.userDelete(id);
    }

    @Override
    public User queryUserById(Integer id) {
        return userDao.queryUserById(id);
    }
}
