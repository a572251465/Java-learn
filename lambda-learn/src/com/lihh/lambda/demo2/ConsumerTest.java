package com.lihh.lambda.demo2;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        consumerHand(msg -> {
            System.out.println(msg + " test");
        });

        consumerTest(s -> System.out.println(s.toUpperCase()), s -> System.out.println(s.toLowerCase()), "hello");
    }

    public static void consumerHand(Consumer<String> consumer) {
        consumer.accept("hello");
    }

    public static void consumerTest(Consumer<String> p, Consumer<String> p1, String msg) {
        p.andThen(p1).accept(msg);
    }
}
