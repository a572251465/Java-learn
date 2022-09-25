package com.lihh.spring.bean;

public class Girl {
    private boolean sex;

    public Girl(boolean sex) {
        this.sex = sex;
    }

    public Girl() {
    }

    @Override
    public String toString() {
        return "Girl{" +
                "sex=" + sex +
                '}';
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
