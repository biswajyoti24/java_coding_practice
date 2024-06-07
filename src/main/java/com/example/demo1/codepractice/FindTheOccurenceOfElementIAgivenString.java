package com.example.demo1.codepractice;

import java.util.*;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheOccurenceOfElementIAgivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listOfString = new ArrayList<>();
        for(int i = 0 ; i< 10;i++){
            listOfString.add(sc.next().toString()) ;
        }
        Map<String,List<String>> OccuranceOfString = listOfString.stream().collect(Collectors.groupingBy(Function.identity()));

        System.out.println(OccuranceOfString);
    }
}
