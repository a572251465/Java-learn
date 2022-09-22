package com.lihh.dao;

import com.lihh.Action;

public class ActionImpl implements Action {

    @Override
    public int add() {
        System.out.println("测试spring");
        return 0;
    }
}
