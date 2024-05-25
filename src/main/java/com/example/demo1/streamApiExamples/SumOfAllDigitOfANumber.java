package com.example.demo1.streamApiExamples;

import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigitOfANumber {
    public static void main(String[] args) {
        int i = 15623;
        int result = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(result);
    }
}
