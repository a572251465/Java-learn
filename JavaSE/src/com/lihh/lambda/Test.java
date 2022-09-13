package com.lihh.lambda;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.lambda
 * @Author: lihh
 * @CreateTime: 2022-09-08  10:46
 * @Description: TODO
 */
public class Test {
  public static void main(String[] args) {
    // 1. 定义实体类 通过实现来解决
    Person p = new Person();
    Thread t = new Thread(p);
    t.start();

    // 2. 通过匿名内部类来解决
    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("这是一个匿名内部类的子线程");
      }
    });
    t1.start();

    // 3. 通过lambda 表达式
    Thread t2 = new Thread(() -> {
      System.out.println("这是一个lambda 表达式的子线程");
    });
    t2.start();
  }
}
