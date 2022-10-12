package com.lihh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration04 {
    @Bean(value = "testBean02")
    public TestBean02 get() {
        return new TestBean02();
    }
}
