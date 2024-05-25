package com.example.demo1.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        String S = "Tendulkar";
        String S1 = S+"";
       if(S== S)
           System.out.println("true");
        String S2 = S.concat("");
        if(S == S2)
            System.out.println("true");

        String S3 = "Tendulkar";
        String S4 = "Gavasker";
        List<Character> s = new ArrayList<>();

        for(int i=0;i<S3.length()-1;i++){

            for(int j=0;j<S4.length()-1;j++){

                if(S1.charAt(i)==S4.charAt(j)){
                    s.add(S1.charAt(i));

                }
            }

        }
        System.out.print(s.stream().collect(Collectors.toSet()));

    }
}
