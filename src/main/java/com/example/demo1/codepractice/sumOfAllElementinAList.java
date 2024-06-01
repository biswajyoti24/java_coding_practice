package com.example.demo1.codepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sumOfAllElementinAList {
    public static void main(String[] args) {
//        ArrayList<Integer> arrInt  =new  ArrayList<>)() [2,3,4,5,6,7,8];

        Integer []arrInt = {4,5,2,8,6};
        int Sum = Arrays.asList(arrInt).stream().collect(Collectors.summingInt(e-> e));

        System.out.println(Sum);

        Map<Integer,List<Integer>> occuranceOfEachElement = Arrays.asList(arrInt).stream().collect(Collectors.groupingBy(Function.identity()));

        System.out.println(occuranceOfEachElement);
    }
}
