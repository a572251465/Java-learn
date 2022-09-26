package com.lihh.dao;

import com.lihh.bean.User;

public interface UserDao {
    int userCount();
    int userAdd(User user);

    int userUpdate();

    int userDelete(Integer id);

    User queryUserById(Integer id);
}
