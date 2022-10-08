package com.lihh.mapper;

import com.lihh.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> queryAllUser();

    User queryUserById(String id);

    List<User> queryAssignUser(Map<String, String> map);

    List<User> queryAssignUser1(User user);
}
