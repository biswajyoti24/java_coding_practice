package com.example.demo1.codepractice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckTheOccuranceOfEachCharacterInAGivenString {
    public static void main(String[] args) {
        String s = "The two string are Anagram";
        Map<Character, List<Character>> map = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity()));

        System.out.println(map.get('a'));
    }
}
