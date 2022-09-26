package com.lihh.com.lihh.service;

import com.lihh.bean.User;

public interface UserService {
    int userCount();
    int userAdd(User user);

    int userUpdate();

    int userDelete(Integer id);

    User queryUserById(Integer id);
}
