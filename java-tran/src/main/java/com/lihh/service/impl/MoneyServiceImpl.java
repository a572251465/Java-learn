package com.lihh.service.impl;

import com.lihh.dao.MoneyDao;
import com.lihh.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MoneyServiceImpl implements MoneyService {

    @Autowired
    private MoneyDao moneyDao;

    @Override
    @Transactional
    public int updateMoney() {
        int rows = 0;

        rows += moneyDao.updateMoney("lxx", 100);
        rows += moneyDao.updateMoney("lll", -100);
        return rows;
    }
}
