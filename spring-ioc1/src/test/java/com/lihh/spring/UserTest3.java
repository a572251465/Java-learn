package com.lihh.spring;

import com.lihh.spring.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest3 {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }
}
