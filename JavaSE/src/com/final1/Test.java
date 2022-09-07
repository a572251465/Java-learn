package com.final1;

/**
 * @Author lihh
 * @Date 2022/8/25 - 08 - 25
 * @Description: Java-learn
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        final int age = 20;
        // 如果用final 修饰基本数据类型的话 就不能再次进行赋值了 可以理解为字符串常量
        //        age = 10;

        final Person p = new Person();
        // 如果是引用数据类型的话 也是不能再次修改地址的
        //        p = new Person();
        // 但是还可以修改引用类型中的属性
        p.name = "20";
        p.age = 10;
    }
}
