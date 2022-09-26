package com.lihh.dao.impl;

import com.lihh.bean.User;
import com.lihh.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int userCount() {
        Integer res = jdbcTemplate.queryForObject("select count(1) from user", Integer.class);
        if (res != null) return res;
        return 0;
    }

    @Override
    public int userAdd(User user) {
        String sql = "insert into user values(DEFAULT, ?, ?)";
        Object[] args = {user.getName(), user.getAge()};
        return jdbcTemplate.update(sql, args);
    }

    @Override
    public int userUpdate() {
        return 0;
    }

    @Override
    public int userDelete(Integer id) {
        return 0;
    }

    @Override
    public User queryUserById(Integer id) {
        return null;
    }
}
