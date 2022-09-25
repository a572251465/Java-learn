package com.lihh.spring.bean;

public class User {
    private Integer age;
    private String name;

    public User() {
        System.out.println("empty constructor User");
    }

    public User(Integer age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("all args constructor User");
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        System.out.println("setAge exec...");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName exec...");
        this.name = name;
    }
}
