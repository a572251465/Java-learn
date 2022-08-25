package com.lihh4;

import java.util.Objects;

/**
 * @Author lihh
 * @Date 2022/8/24 - 08 - 24
 * @Description: Java-learn
 * @version: 1.0
 */
public class Person {
    String name;
    int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
