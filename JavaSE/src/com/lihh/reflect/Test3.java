package com.lihh.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.reflect
 * @Author: lihh
 * @CreateTime: 2022-09-07  14:27
 * @Description: TODO
 */
public class Test3 {
  public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    Class cls = Person.class;

    // 获取所有的被public 修饰的属性
    Field[] fls = cls.getFields();
    for (Field f: fls) {
      System.out.println(f);
    }

    System.out.println("--------------------");

    // 获取所有的属性
    Field[] fls1 = cls.getDeclaredFields();
    for (Field f: fls1) {
      System.out.println(f);
    }

    System.out.println("--------------------");

    // 获取指定的属性
    Field emil = cls.getField("emil");
    System.out.println(emil);

    System.out.println("--------------------");

    // 获取指定属性的数据类型
    Class e1 = emil.getType();
    System.out.println(e1.getName());

    System.out.println("--------------------");

    // 获取指定属性的修饰符
    int modifiers = emil.getModifiers();
    System.out.println(Modifier.toString(modifiers));

    System.out.println("--------------------");

    // 给指定属性 设置值
    Constructor con1 = cls.getConstructor();
    Object s = con1.newInstance();
    emil.set(s, "test email");
    System.out.println(s);
  }
}
