package com.final1;

/**
 * @Author lihh
 * @Date 2022/8/25 - 08 - 25
 * @Description: Java-learn
 * @version: 1.0
 */
public class Test1 {
    void fn1() {
        final Person p = new Person();
        fn2(p);
    }

    void fn2(Person p) {
        p = new Person();
    }
}
