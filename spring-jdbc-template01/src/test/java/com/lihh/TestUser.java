package com.lihh;

import com.lihh.bean.User;
import com.lihh.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = applicationContext.getBean(UserController.class);

        Integer count = userController.userCount();
        System.out.println(count);

        Integer count1 = userController.userAdd(new User("wll", 20));
        System.out.println(count1);
    }
}
