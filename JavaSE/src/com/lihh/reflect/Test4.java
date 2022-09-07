package com.lihh.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.reflect
 * @Author: lihh
 * @CreateTime: 2022-09-07  14:39
 * @Description: TODO
 */
public class Test4 {
  public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
    Class cls = Person.class;

    // 获取所有被public 修饰的方法
    Method[] ms = cls.getMethods();
    for (Method m : ms) {
      System.out.println(m);
    }

    System.out.println("-------------------");

    // 获取所有的方法
    Method[] ms1 = cls.getDeclaredMethods();
    for (Method m : ms1) {
      System.out.println(m);
    }

    System.out.println("-------------------");

    // 获取指定的方法
    Method m1 = cls.getMethod("say");
    System.out.println(m1);

    System.out.println("-------------------");

    // 获取指定名称 指定参数的方法
    Method m2 = cls.getMethod("look", String.class, String.class);
    System.out.println(m2);

    // 获取名称/ 修饰符/ 返回值/ 参数列表/ 获取注解
    System.out.println(m2.getName());
    System.out.println(Modifier.toString(m2.getModifiers()));
    System.out.println(m2.getReturnType());
    Class[] t1 = m2.getParameterTypes();
    for (Class t : t1) {
      System.out.println(t);
    }

    Method m3 = cls.getDeclaredMethod("eat");
    Annotation[] an = m3.getAnnotations();
    for (Annotation a : an) {
      System.out.println(a);
    }

    System.out.println("-------------------");

    // 调用函数
    Method m4 = cls.getMethod("look", String.class, String.class);
    Object o = cls.newInstance();
    m4.invoke(o, "测试参数1", "测试参数2");
  }
}
