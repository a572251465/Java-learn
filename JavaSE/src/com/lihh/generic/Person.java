package com.lihh.generic;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.generic
 * @Author: lihh
 * @CreateTime: 2022-08-29  18:46
 * @Description: TODO
 */
public class Person<K> {
    K name;
    K school;
    int age;

    public K getName() {
        return name;
    }

    public void setName(K name) {
        this.name = name;
    }

    public void setSchool(K school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", school=" + school +
                ", age=" + age +
                '}';
    }
}
