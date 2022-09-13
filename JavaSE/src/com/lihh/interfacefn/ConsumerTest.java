package com.lihh.interfacefn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.interfacefn
 * @Author: lihh
 * @CreateTime: 2022-09-09  15:08
 * @Description: TODO
 */
public class ConsumerTest {
  public static void main(String[] args) {
    show((list) -> {
      Collections.sort(list, Comparator.comparingInt(a -> a));
      System.out.println(list);
    });

    transform((msg) -> {
      System.out.println(msg + "1");
    }, (msg) -> {
      System.out.println(msg + "2");
    });
  }

  public static void show(Consumer<List<Integer>> consumer) {
    List<Integer> list = new ArrayList<>();
    list.add(20);
    list.add(10);
    list.add(30);
    consumer.accept(list);
  }

  public static void transform(Consumer<String> c1, Consumer<String> c2) {
    c1.andThen(c2).accept("123");
  }
}
