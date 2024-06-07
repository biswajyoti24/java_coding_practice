package com.example.demo1.codepractice;

import java.io.InputStream;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFrequencyOfEachNumber {
    public static void main(String[] args) {
        int num = 765765;
        String s1 = "FindFrequencyOfEachNumber";
        System.out.println(num);
        int s = Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
//        int s2 = Stream.of(String.valueOf(num).split("")).collect(Collectors.partitioningBy(x-> x/2==0));
        System.out.println(s);
        Map<String,List<String>> map = Stream.of(String.valueOf(num).split("")).collect(Collectors.groupingBy(Function.identity()));
        Map<String,List<String>> map2 = Stream.of(s1.split("")).collect(Collectors.groupingBy(Function.identity()));

        System.out.println(map);
        System.out.println(map2);
        List<Integer> intArr = new ArrayList<>();
        int i = 1;
        while( i > 0){
            i = num%10;
            num = num/10;
            if(i!=0)
            intArr.add(i);
        }

        Map<Integer,List<Integer>> map3 = intArr.stream().sorted(Comparator.naturalOrder()).collect(Collectors.groupingBy(Function.identity()));
        Map<Boolean,List<Integer>> map4 = intArr.stream().sorted(Comparator.naturalOrder()).collect(Collectors.partitioningBy(x-> x/2==0));


        System.out.println(map3);
        System.out.println(map4);

    }
}
