package com.lihh.interface1;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.interface1
 * @Author: lihh
 * @CreateTime: 2022-09-09  13:32
 * @Description: TODO
 */
public class Test {
  public static void main(String[] args) {
    Person p = new Person();
    System.out.println(IInterface.test);
    p.run();

    System.out.println("--------------------------");

    IAction ia = new ActonImpl();
    IAction.hand();
    ia.show();
    (new ActonImpl()).show1();
    ia.run();
    System.out.println(IAction.type);
  }
}
