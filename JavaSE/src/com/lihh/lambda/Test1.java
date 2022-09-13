package com.lihh.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.lambda
 * @Author: lihh
 * @CreateTime: 2022-09-08  12:23
 * @Description: TODO
 */
public class Test1 {
  public static void main(String[] args) {
    List<User> list = new ArrayList<>();
    list.add(new User("lixx", 20));
    list.add(new User("lixx1", 30));
    list.add(new User("lixx2", 10));
    list.add(new User("lixx3", 40));
    list.add(new User("lixx4", 120));
    list.add(new User("lixx5", 110));

    Collections.sort(list, (User a, User b) -> {
      return a.getAge() - b.getAge();
    });

    for (User u: list) {
      System.out.println(u);
    }
  }
}
