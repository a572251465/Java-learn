package com.lihh.controller;

import com.lihh.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MoneyController {

    @Autowired
    private MoneyService moneyService;

    public int updateMoney() {
        return moneyService.updateMoney();
    }
}
