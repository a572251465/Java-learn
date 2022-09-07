package com.lihh.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.generic
 * @Author: lihh
 * @CreateTime: 2022-08-29  20:47
 * @Description: TODO
 */
public class Test1 {
    public static void main(String[] args) {
        Object o = new Object();
        Person1<String> p = new Person1();
        WoMan<Integer> w = new WoMan();

//        p = w;
//        o = w;
//        o = p;

        List<?> l1 = new ArrayList<>();
        List<Person1> l2 = new ArrayList<>();
        l1 = l2;

        List<WoMan> l3 = new ArrayList<>();
        l1 = l3;
    }
}
