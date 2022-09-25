package com.lihh.spring;

import com.lihh.spring.bean.User1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext6.xml");
        User1 user1 = applicationContext.getBean("user", User1.class);
        System.out.println(user1);
    }
}
