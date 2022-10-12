package com.lihh;

import org.springframework.stereotype.Component;

@Component
public class TestComponent {
    public void say() {
        System.out.println("testComponent say");
    }

    public void hello() {
        System.out.println("testComponent hello");
    }
}
