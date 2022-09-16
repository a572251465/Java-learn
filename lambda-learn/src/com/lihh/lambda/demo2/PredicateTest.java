package com.lihh.lambda.demo2;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        andMethod(s -> s.contains("h"), s -> s.contains("e"));
        orMethod(s -> s.contains("m"), s -> s.contains("w"));
        negateMethod(s -> s.contains("m"));
    }

    static void andMethod(Predicate<String> one, Predicate<String> two) {
        boolean isValid = one.and(two).test("hello");
        System.out.println(isValid);
    }

    static void orMethod(Predicate<String> one, Predicate<String> two) {
        boolean isValid = one.or(two).test("hello");
        System.out.println(isValid);
    }

    static void negateMethod(Predicate<String> one) {
        boolean isValid = one.negate().test("hello");
        System.out.println(isValid);
    }
}
