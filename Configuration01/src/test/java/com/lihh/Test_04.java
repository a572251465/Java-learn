package com.lihh;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_04 {
    @Test
    public void run() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(WebConfig.class);
        TestBean01 testBean01 = (TestBean01) applicationContext.getBean("testBean01");
        testBean01.say();
    }
}
