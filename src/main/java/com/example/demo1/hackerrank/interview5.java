package com.example.demo1.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class interview5 {
    public static void main(String []args){
        String words = "ate tea tan nat eat bat";
        List<String>  wordArr = Arrays.asList(words.split(" "));

        List<List<String>> anagramStringList  = checkAnagramString(wordArr);

        System.out.println(anagramStringList);
    }

   public static List<List<String>> checkAnagramString(List<String> wordsarr){
       Set<String> set1  =  wordsarr.stream().map(s-> sortString(s)).collect(Collectors.toSet());
       List<List<String>> anagramStringList1 = set1.stream().map(x->{
                   List<String> xyz = wordsarr.stream().filter(y-> sortString(y).equals(x)).collect(Collectors.toList());
                   return xyz;
               })
               .collect(Collectors.toList());
       return anagramStringList1;
    }
    public static String sortString(String s){
        char chrArr[] = s.toCharArray();
        char ch = ' ';
        for(int i = 0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(chrArr[j]>chrArr[i]) {
                    ch = chrArr[i];
                    chrArr[i] = chrArr[j];
                    chrArr[j] = ch;

                }
            }
        }
        return  new String(chrArr);
    }
}
