package com.lihh.spring;

import com.lihh.spring.bean.Person;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
    @Test
    public void test() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext5.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println("4. 容器中获取示例");
        applicationContext.close();
    }
}
