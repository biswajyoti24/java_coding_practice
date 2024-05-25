package com.example.demo1.streamApiExamples;
import java.util.*;
import java.util.stream.Collectors;

public class StringJoinSuffixPrefixDelimeter {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        List<String> listOfStringWithSuffixPrefixDelimeter = listOfStrings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());

        System.out.println(listOfStrings);
        System.out.println(listOfStringWithSuffixPrefixDelimeter);

        String str1 = listOfStrings.stream().collect(Collectors.joining(" ","",""));
        System.out.println(str1);
    }
}
