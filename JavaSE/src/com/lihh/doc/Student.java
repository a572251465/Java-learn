package com.lihh.doc;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.doc
 * @Author: lihh
 * @CreateTime: 2022-09-05  22:33
 * @Description: TODO
 */
public class Student extends Person {

  /**
   * 吃东西的函数
   * @param name 名称
   * @param age 年龄
   * @exception RuntimeException 年龄小于20的时候 抛出异常
   * @exception Exception 年龄小于20的时候 抛出异常
   * @see Animal
   */
  @Override
  public void eat(String name, int age) throws Exception {
    if (age < 20) throw new RuntimeException();
    if (age < 40) throw new Exception();

    Animal a = new Animal();

    System.out.println(age);
  }
}
