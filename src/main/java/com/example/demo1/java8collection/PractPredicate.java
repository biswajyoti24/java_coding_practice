package com.example.demo1.java8collection;

import java.util.function.Predicate;

public class PractPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer t) {
        return t >= 18 && t < 25;
    }

    public static void main(String[] args) {
        PractPredicate customPredicate = new PractPredicate();


        // another way to use predicates is by lambda expressions
        Predicate<Integer> greaterThan45 = x -> x > 45;
        System.out.println(greaterThan45.test(90)); // true
        Predicate<Integer> lessthan19 = x-> x<19;
        System.out.println(greaterThan45.test(30)); // false
        System.out.println(lessthan19.test(10)); // false
        System.out.println(customPredicate.test(19)); // true

    }
}