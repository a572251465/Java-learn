package com.lihh.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.set
 * @Author: lihh
 * @CreateTime: 2022-08-30  11:58
 * @Description: TODO
 */
public class Test {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(10);
        s.add(40);
        s.add(4);
        s.add(10);
        s.add(9);

        System.out.println(s.size());
        System.out.println(s);

        Set<String> s1 = new HashSet<>();
        s1.add("2");
        s1.add("1");
        s1.add("6");
        s1.add("4");
        s1.add("9");
        s1.add("0");
        s1.add("2");
        System.out.println(s1.size());
        System.out.println(s1);

        Set<User> s2 = new HashSet<>();
        s2.add(new User("lxx"));
        s2.add(new User("099"));
        s2.add(new User("022"));
        s2.add(new User("088"));
        s2.add(new User("011"));
        s2.add(new User("lxx"));

        System.out.println(s2.size());
        System.out.println(s2);
    }
}
