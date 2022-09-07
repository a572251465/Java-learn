package com.lihh.reflect;

import java.lang.annotation.Annotation;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.reflect
 * @Author: lihh
 * @CreateTime: 2022-09-07  14:53
 * @Description: TODO
 */
public class Test5 {
  public static void main(String[] args) {
    Class cls = Person.class;

    // 获取实现的接口
    Class[] ints = cls.getInterfaces();
    for (Class i: ints) {
      System.out.println(i);
    }

    System.out.println("---------------------------");

    // 获取父类的字节码信息
    Class p = cls.getSuperclass();
    System.out.println(p);

    System.out.println("---------------------------");

    // 获取运行时所在包
    Package ap = cls.getPackage();
    System.out.println(ap);
    System.out.println(ap.getName());

    System.out.println("---------------------------");

    // 获取运行时注解
    Annotation[] an = cls.getAnnotations();
    for (Annotation a: an) {
      System.out.println(a);
    }
  }
}
