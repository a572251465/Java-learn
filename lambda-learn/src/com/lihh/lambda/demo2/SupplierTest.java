package com.lihh.lambda.demo2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 10, 1, 9, 11, 20);
        int max = getMax(() -> {
            int res = list.get(0);
            for (int item: list) {
                if (item > res) res = item;
            }
            return res;
        });
        System.out.println(max);
    }

    public static int getMax(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
