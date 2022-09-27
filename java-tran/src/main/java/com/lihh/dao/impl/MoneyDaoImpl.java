package com.lihh.dao.impl;

import com.lihh.dao.MoneyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MoneyDaoImpl implements MoneyDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int updateMoney(String name, int money) {
        String sql = "update money set money = money + ? where name = ?";

        return jdbcTemplate.update(sql, money, name);
    }
}
