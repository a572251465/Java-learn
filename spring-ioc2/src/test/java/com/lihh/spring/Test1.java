package com.lihh.spring;

import com.lihh.spring.controller.Man;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext1.xml");
        Man man = applicationContext.getBean("man", Man.class);
        System.out.println(man);
    }
}
