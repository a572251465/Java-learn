package com.lihh;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_03 {
    @Test
    public void run() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestConfiguration03.class);
        TestComponent testComponent = (TestComponent) applicationContext.getBean("testComponent");
        testComponent.say();
        testComponent.hello();
    }
}
