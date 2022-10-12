package com.lihh;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_05 {

    @Test
    public void run() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(WebConfig01.class);
        TestBean02 testBean02 = (TestBean02) applicationContext.getBean("testBean02");
        testBean02.say();
    }
}
