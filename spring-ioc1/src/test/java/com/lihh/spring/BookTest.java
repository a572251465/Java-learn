package com.lihh.spring;

import com.lihh.spring.bean.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4.xml");
        Book book = applicationContext.getBean("book", Book.class);
        System.out.println(book);
    }
}
