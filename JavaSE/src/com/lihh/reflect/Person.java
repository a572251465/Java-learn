package com.lihh.reflect;

import com.lihh.annotate.MyActon;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.reflect
 * @Author: lihh
 * @CreateTime: 2022-09-07  11:22
 * @Description: TODO
 */
@MyActon
public class Person extends User implements IAction {
  public int age;
  private boolean sex;
  protected String address;

  public String emil;

  private Person(String address, String emil) {
    this.address = address;
    this.emil = emil;
  }

  public Person() {

  }

  public Person(int age) {
    this.age = age;
  }

  public Person(int age, boolean sex) {
    this.age = age;
    this.sex = sex;
  }

  public Person(int age, boolean sex, String address) {
    this.age = age;
    this.sex = sex;
    this.address = address;
  }

  @MyAction
  private void eat() {
    System.out.println("我是吃饭的私有方法");
  }

  public void say() {
    System.out.println("我来进行说一下 这个事情什么事情啊 ");
  }

  public void look(String name, String address) {
    System.out.println(name);
    System.out.println(address);
  }

  @Override
  public String toString() {
    return "Person{" +
        "age=" + age +
        ", sex=" + sex +
        ", address='" + address + '\'' +
        ", emil='" + emil + '\'' +
        '}';
  }
}
