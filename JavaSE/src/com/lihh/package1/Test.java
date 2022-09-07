package com.lihh.package1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author lihh
 * @Date 2022/8/27 - 08 - 27
 * @Description: Java-learn
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Integer i = new Integer(20);
        int a = i;
        Integer b = 20;

        System.out.println(a);
        System.out.println(b);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // 使用函数<compareTo> 进行元素值的比较 如果是小于返回-1 如果是等于返回0 如果是大于返回1
        System.out.println(i.compareTo(b));
        System.out.println(new Integer(10).compareTo(b));
        System.out.println(new Integer(30).compareTo(b));

        // equals 内部将包装类型转换基本数据类型 实际上比较的是基本数据类型的值
        System.out.println(b.equals(i));

        Date d = new Date();
        System.out.println(d);
        System.out.println(System.currentTimeMillis());
        System.out.println(d.toLocaleString());

        java.sql.Date d1 = new java.sql.Date(1661579949435l);
        System.out.println(d1);

        DateFormat d2 = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        System.out.println(d2.toString());

        System.out.println(d2.format(new Date()));
    }
}
