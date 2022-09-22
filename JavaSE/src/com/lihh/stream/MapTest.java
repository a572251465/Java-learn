package com.lihh.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3", "4");

        List<Integer> res = list.stream().map(Integer::parseInt).collect(Collectors.toList());
        for (Integer item: res) {
            System.out.println(item);
        }
    }
}
