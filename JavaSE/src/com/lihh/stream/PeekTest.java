package com.lihh.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PeekTest {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("lixx", 22));
        list.add(new Person("lll", 21));

        List<Person> res = list.stream().peek(s -> {
            s.setAge(s.getAge() + 5);
        }).collect(Collectors.toList());

        for (Person p: res) {
            System.out.println(p);
        }
    }
}
