package com.lihh.spring;

import com.lihh.spring.service.Run;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    @Test
    public void test() {
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext3.xml");
        Run run = context.getBean("run", Run.class);
        run.add();
    }
}
