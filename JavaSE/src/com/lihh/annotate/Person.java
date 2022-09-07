package com.lihh.annotate;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.annotate
 * @Author: lihh
 * @CreateTime: 2022-09-06  13:20
 * @Description: TODO
 */
public class Person {
  @SuppressWarnings("unused")
  int age = 10;

  @Deprecated
  public void eat() {
    System.out.println("其实就是为了吃");
  }
}
