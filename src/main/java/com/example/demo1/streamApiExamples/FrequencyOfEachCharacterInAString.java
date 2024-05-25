package com.example.demo1.streamApiExamples;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacterInAString {
    public static void main(String[] args) {
       /* List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> listOfUnqStrings = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(listOfUnqStrings);*/
        String inputString = "Java Concept Of The Day";

//        System.out.println(inputString.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(Function.identity())));
        Map<Character, List<Character>> countOfEachCharacter = inputString.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(Function.identity()));

        System.out.println(countOfEachCharacter);
        System.out.println(countOfEachCharacter.get('a').stream().collect(Collectors.counting()));
    }
}
