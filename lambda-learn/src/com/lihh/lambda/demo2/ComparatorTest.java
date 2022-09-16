package com.lihh.lambda.demo2;

import java.util.Arrays;

public class ComparatorTest {
    public static void main(String[] args) {
        String[] arr = {"12", "245", "1", "678", "33"};
        Arrays.sort(arr, (a, b) -> a.length() - b.length());

        System.out.println(Arrays.toString(arr));
    }
}
