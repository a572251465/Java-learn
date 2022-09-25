package com.lihh.spring.bean;

public class Person {
    private String name;

    public Person() {
        System.out.println("1. Person构造方法");
    }

    public Person(String name) {
        this.name = name;
    }

    public void initPerson() {
        System.out.println("3. init Person");
    }

    public void destroyPerson() {
        System.out.println("5. destroy Person");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2. 设置属性");
        this.name = name;
    }
}
