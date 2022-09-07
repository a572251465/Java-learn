package com.lihh.generic1;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.generic1
 * @Author: lihh
 * @CreateTime: 2022-08-29  21:01
 * @Description: TODO
 */
public class User<K> {
    K name;
    int age;

    public K getName() {
        return name;
    }

    public void setName(K name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
