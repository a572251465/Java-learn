package com.lihh.generic;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.generic
 * @Author: lihh
 * @CreateTime: 2022-08-29  20:48
 * @Description: TODO
 */
public class WoMan<T> extends Person1<T> {
    T age;

    public void setAge(T age) {
        this.age = age;
    }

    public T getAge() {
        return age;
    }
}
