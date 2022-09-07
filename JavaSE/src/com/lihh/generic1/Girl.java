package com.lihh.generic1;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.generic1
 * @Author: lihh
 * @CreateTime: 2022-08-29  21:06
 * @Description: TODO
 */
public class Girl<T> extends User {
    T school;

    public void setSchool(T school) {
        this.school = school;
    }

    public T getSchool() {
        return school;
    }

    public <M> void eat(M names) {
        System.out.println(names);
    }
}
