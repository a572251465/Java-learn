package com.lihh.lambda.demo;

public class SuperClass implements IAction {
    @Override
    public Object getObject() {
        return new User("lixx", 23);
    }
}
