package com.lihh;

import com.lihh.controller.MoneyController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMoney {

    @Test
    public void run() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MoneyController moneyController = applicationContext.getBean(MoneyController.class);
        int rows = moneyController.updateMoney();
        System.out.println(rows);
    }
}
