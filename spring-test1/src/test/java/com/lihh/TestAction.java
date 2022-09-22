package com.lihh;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAction {
    @Test
    public void testAction() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Action action = applicationContext.getBean("actionImpl", Action.class);

        action.add();
    }
}
