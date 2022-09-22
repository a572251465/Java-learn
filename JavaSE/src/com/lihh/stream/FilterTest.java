package com.lihh.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("lxx", "ly", "zss", "zyy", "zw");

        List<String> res = list.stream().
                filter(s -> s.startsWith("z")).
                filter(s -> s.length() == 3).
                collect(Collectors.toList());

        for (String item: res) {
            System.out.println(item);
        }
    }
}
