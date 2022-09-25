package com.lihh.spring;

import com.lihh.spring.bean.User1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest2 {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        User1 user1 = applicationContext.getBean("user1", User1.class);

        System.out.println(user1);
    }
}
