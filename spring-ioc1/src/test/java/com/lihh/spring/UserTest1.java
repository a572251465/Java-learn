package com.lihh.spring;

import com.lihh.spring.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest1 {

    @Test
    public void userTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext1.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);

        User user1 = applicationContext.getBean("user1", User.class);
        System.out.println(user1);
    }
}
