package com.lihh.generic1;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.generic1
 * @Author: lihh
 * @CreateTime: 2022-08-29  21:01
 * @Description: TODO
 */
public class Test {
    public static void main(String[] args) {
        // ---------- 没有设置数据类型 默认都是Object类型
        User u = new User();
        u.setName(false);

        // --------- 设置数据类型
        User<String> u1 = new User();
        u1.setName("lxx");

        Girl<String> g = new Girl();
        g.setSchool("xxx");
        g.setName(false);
        g.eat(false);

        // Object/ Object[] 与String/ String[] 存在继承关系 父类声明 子类实例
        Object o = new Object();
        String s = new String();
        o = s;

        Object[] oArr = new Object[10];
        String[] sArr = new String[10];
        oArr = sArr;

        List<Object> ol = new ArrayList<>();
        List<String> os = new ArrayList<>();
        // 不存在继承关系 泛型只是从语法层面进行约束。但是ArrayList 本质上都是数组
//        ol = os;

        List<?> l = new ArrayList<>();
        l = ol;
        l = os;

        List<Object> l1 = new ArrayList<>();
        List<User> l2 = new ArrayList<>();
        List<Girl> l3 = new ArrayList<>();

        // 表示类型上限 表示其以及子类 都可以赋值
        List<? extends User> l4 = new ArrayList<>();
        l4 = l2;
        l4 = l3;
//        l4 = l1;

        // 表示类型的下限 表示其以及父类，祖父类等 都可以赋值
        List<? super User> l5 = new ArrayList<>();
        l5 = l1;
        l5 = l2;
//        l5 = l3;
    }
}
