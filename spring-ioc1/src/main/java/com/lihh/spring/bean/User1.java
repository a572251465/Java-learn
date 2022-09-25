package com.lihh.spring.bean;

public class User1 {
    private Girl girl;

    public User1() {
    }

    public User1(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String toString() {
        return "User1{" +
                "girl=" + girl +
                '}';
    }

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }
}
