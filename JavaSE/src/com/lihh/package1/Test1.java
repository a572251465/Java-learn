package com.lihh.package1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * @Author lihh
 * @Date 2022/8/27 - 08 - 27
 * @Description: Java-learn
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println(Math.ceil(1.1));
        System.out.println(Math.floor(1.1));

        LocalDateTime d = LocalDateTime.now();
        System.out.println(d.getYear());
        System.out.println(d.getDayOfMonth());
        System.out.println(d.getMonth());
        System.out.println(d.getMonthValue());

        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(d1.format(d));

        TemporalAccessor p = d1.parse("2023-08-12 03:22:11");
        System.out.println(p);

    }
}
