package com.example.demo1.streamApiExamples;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DecimalListInReverseOrder {
    public static void main(String[] args) {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        List<Double> reverseOrderDecimalList = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseOrderDecimalList);
    }
}
