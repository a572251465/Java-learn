package com.lihh2;

/**
 * @Author lihh
 * @Date 2022/8/22 - 08 - 22
 * @Description: Java-learn
 * @version: 1.0
 */
public class Person {
    String name;
    static int age;

    public void getName() {
        System.out.println(this.name);
        System.out.println(age);
    }

    public static int getAge() {
        return Person.age;
    }
}
