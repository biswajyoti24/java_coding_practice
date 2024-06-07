package com.example.demo1.codepractice;

import java.util.*;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ChecktheOccuranceodCharatersInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println( str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity())));
        System.out.println(str.contains("gent"));
        char[] charr = str.toCharArray();

        List<Character> charaarray = new ArrayList<>();
        for(char ch : str.toCharArray()){

            charaarray.add(ch);

        }
        System.out.println(charaarray.stream().collect(Collectors.groupingBy(Function.identity())));
    }
}
