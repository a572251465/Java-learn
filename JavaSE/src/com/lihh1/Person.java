package com.lihh1;

/**
 * @Author lihh
 * @Date 2022/8/22 - 08 - 22
 * @Description: Java-learn
 * @version: 1.0
 */
public class Person {
    String name;
    String school;
    int age;

    public Person() {}

    public Person(String name, String school, int age) {
        this(school, age);
        this.name = name;
    }

    public Person(String school, int age) {
        this(age);
        this.school = school;
    }

    public Person(int age) {
        this.age = age;
    }
}
