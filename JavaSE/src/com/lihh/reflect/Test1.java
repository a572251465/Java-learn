package com.lihh.reflect;

import java.lang.reflect.Constructor;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.reflect
 * @Author: lihh
 * @CreateTime: 2022-09-07  13:59
 * @Description: TODO
 */
public class Test1 {
  public static void main(String[] args) throws NoSuchMethodException {
    // ----- 1. 获取类构造器 以及创建对象

    Class cls = Person.class;

    // 获取可以所有的被 public 修饰的构造函数
    Constructor[] c1 = cls.getConstructors();
    for (Constructor c: c1) {
      System.out.println(c);
    }

    System.out.println("--------------");

    // 获取所有的构造函数
    Constructor[] c2 = cls.getDeclaredConstructors();
    for (Constructor c: c2) {
      System.out.println(c);
    }

    System.out.println("--------------");

    // 获取空构造函数
    Constructor c3 = cls.getConstructor();
    System.out.println(c3);

    System.out.println("--------------");

    // 获取指定参数的构造器
    Constructor c4 = cls.getDeclaredConstructor(String.class, String.class);
    System.out.println(c4);
  }
}
