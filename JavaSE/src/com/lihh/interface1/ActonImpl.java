package com.lihh.interface1;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.interface1
 * @Author: lihh
 * @CreateTime: 2022-09-09  13:42
 * @Description: TODO
 */
public class ActonImpl implements IAction {
  @Override
  public void run() {
    System.out.println("重写父类中的抽象方法");
  }

  public void show1() {
    IAction.super.show();
  }

  @Override
  public void show() {
    System.out.println("重写父类中 被default修饰的方法");
  }
}
