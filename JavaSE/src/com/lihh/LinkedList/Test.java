package com.lihh.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.LinkedList
 * @Author: lihh
 * @CreateTime: 2022-08-29  21:56
 * @Description: TODO
 */
public class Test {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.offer("1");
        l.offerFirst("2");
        l.offerLast("3");

        System.out.println(l.element());
        System.out.println(l);

        System.out.println(l.poll());
        System.out.println(l);

        List l1 = new ArrayList();
    }
}
