package com.lihh.set;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.set
 * @Author: lihh
 * @CreateTime: 2022-08-30  12:06
 * @Description: TODO
 */
public class User {
    String name;

    public User() {}

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
