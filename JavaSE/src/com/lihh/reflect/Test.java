package com.lihh.reflect;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.reflect
 * @Author: lihh
 * @CreateTime: 2022-09-07  12:07
 * @Description: TODO
 */
public class Test {
  public static void main(String[] args) throws Exception {
    // 获取字节码 信息的4种方式
    // 1. 通过实例的getClass 函数
    Person p = new Person();
    Class c1 = p.getClass();
    System.out.println(c1);

    // 2. 通过内置属性
    Class c2 = Person.class;
    System.out.println(c2);

    // 3. 通过静态方法forName 进行调用
    Class c3 = Class.forName("com.lihh.reflect.Person");
    System.out.println(c3);

    // 4. 利用类的加载器
    ClassLoader loader = Test.class.getClassLoader();
    Class c4 = loader.loadClass("com.lihh.reflect.Person");
    System.out.println(c4);
  }
}
