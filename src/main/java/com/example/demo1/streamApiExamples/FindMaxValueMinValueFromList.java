package com.example.demo1.streamApiExamples;
import java.util.*;
import java.util.stream.Collectors;

public class FindMaxValueMinValueFromList {
    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer maxvalue = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        Integer minvalue = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Maximum value from the list is : "+maxvalue);
        System.out.println("Minimum value from the list is : "+minvalue);

        List<Integer> mulipleOfFiveNumbers = listOfIntegers.stream().filter(x-> x%5==0).collect(Collectors.toList());

        System.out.println("Multiple of 5  value from the list are : "+mulipleOfFiveNumbers);

    }
}
