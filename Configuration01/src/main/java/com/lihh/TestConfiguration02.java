package com.lihh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration02 {

    @Bean(value = "testBean", initMethod = "start", destroyMethod = "clean")
    public TestBean testBean() {
        return new TestBean();
    }
}
