package com.lihh.generic;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.generic
 * @Author: lihh
 * @CreateTime: 2022-08-29  20:47
 * @Description: TODO
 */
public class Person1<K> {
    K name;

    public K getName() {
        return name;
    }

    public void setName(K name) {
        this.name = name;
    }
}
