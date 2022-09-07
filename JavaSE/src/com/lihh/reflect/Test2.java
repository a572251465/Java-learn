package com.lihh.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.reflect
 * @Author: lihh
 * @CreateTime: 2022-09-07  14:12
 * @Description: TODO
 */
public class Test2 {
  public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
    Class cls = Person.class;

    Constructor c1 = cls.getConstructor();
    Constructor c2 = cls.getDeclaredConstructor(int.class, boolean.class);

    // 实例化 空构造函数
    Object o = c1.newInstance();
    System.out.println(o);

    // 实例化 有参构造函数
    Object o1 = c2.newInstance(20, false);
    System.out.println(o1);
  }
}
