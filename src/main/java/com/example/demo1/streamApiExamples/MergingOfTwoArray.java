package com.example.demo1.streamApiExamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class MergingOfTwoArray {
    public static void main(String[] args) {
        int[] a =  {4, 2, 7, 1};

        int[] b =  {8, 3, 9, 5};

        int[] integerList = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();

        System.out.println(integerList);
    }
}
