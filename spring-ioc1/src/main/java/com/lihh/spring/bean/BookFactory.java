package com.lihh.spring.bean;

import org.springframework.beans.factory.FactoryBean;

public class BookFactory implements FactoryBean<Book> {
    @Override
    public Book getObject() throws Exception {
        return new Book("lxx-book", "lxx");
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
