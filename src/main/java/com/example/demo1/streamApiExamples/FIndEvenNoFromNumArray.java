package com.example.demo1.streamApiExamples;

import java.util.*;
import java.util.stream.Collectors;

public class FIndEvenNoFromNumArray {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        List<Integer> listOfEvenIntegers = listOfIntegers.stream().filter(ints-> ints%2 ==0).collect(Collectors.toList());
        List<Integer> listOfOddIntegers = listOfIntegers.stream().filter(ints-> ints%2 !=0).collect(Collectors.toList());
        System.out.println("listOfEvenIntegers : "+listOfEvenIntegers);
        System.out.println("listOfOddIntegers : "+listOfOddIntegers);
        System.out.println(listOfIntegers.stream().collect(Collectors.partitioningBy( i->i%2 == 0)));
    }
}
