package com.lihh.list;

import java.util.*;

/**
 * @Author lihh
 * @Date 2022/8/28 - 08 - 28
 * @Description: Java-learn
 * @version: 1.0
 */
public class List1 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(1);
        col.add(2);
        col.add(3);
        col.add(4);


        List l1 = new ArrayList();
        l1.add('a');
        l1.add('b');
        l1.add('c');

        col.addAll(l1);
        System.out.println(col);

        for (Object o: col) {
            System.out.println(o);
        }

        System.out.println("-----------------------------------------");

        Iterator it = col.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Vector v = new Vector();
    }
}
