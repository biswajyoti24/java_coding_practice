package com.example.demo1.streamApiExamples;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElementInArray {
    public static void main(String[] args) {
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String,List<String>> listOfString = stationeryList.stream().collect(Collectors.groupingBy(Function.identity()));
        System.out.println(listOfString.get("Pen"));
        System.out.println(listOfString);
    }
}
