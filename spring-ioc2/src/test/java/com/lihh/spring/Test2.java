package com.lihh.spring;

import com.lihh.spring.service.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
    }
}
