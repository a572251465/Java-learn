package com.lihh.annotate;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.annotate
 * @Author: lihh
 * @CreateTime: 2022-09-06  13:27
 * @Description: TODO
 */
public class Student extends Person {
  @Override
  @MyAction1(0)
  @MyActon
  public void eat() {
    System.out.println("我是子类的打印结果");
  }
}
