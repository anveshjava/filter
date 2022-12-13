package com.java8;

import fs01.FS01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class Practise {
    public static void main(String[] args) {
        List<Integer> numeric = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeric.add(i);
        }
        int result = 0;
        for (int i : numeric) {
            result = result + i;
            //System.out.println(result);
        }
        //System.out.println(result);
        System.out.println(numeric.stream().map(i -> i).reduce(0, (v, j) -> v + j));
        Stream s = numeric.stream();
        Function<Integer, Integer> f = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer i) {
                return i;
            }
        };
        BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer i, Integer j) {
                return i + j;
            }
        };
        Stream s1 = s.map(f);
        Integer re = (Integer) s1.reduce(0, b);

        System.out.println(re);
        FS01 obj = new FS01();
        obj.filter();

    }
}
