package com.example.demo1.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        String[] Arr = {"test","test1" ,"test2"};

        String[] Arr1 = {"test1","test2"};

        List<String> l1 = new ArrayList<>();

        for(String s : Arr){
            for(String s1 : Arr1){

                if(s==s1)
                {
                    l1.add(s);
                }
            }
        }
        System.out.println(l1);

        List<String> l2 =Arrays.asList(Arr).stream().filter(Arrays.asList(Arr1)::contains).collect(Collectors.toList());
        System.out.println(l2);


    }

}
