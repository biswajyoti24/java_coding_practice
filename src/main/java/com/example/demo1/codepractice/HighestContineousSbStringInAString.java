package com.example.demo1.codepractice;

import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HighestContineousSbStringInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<String> subStringList = new ArrayList<>();
        subStringList = getAllSubStringofContineousCharacters(s);
        System.out.println(subStringList);
        String s2 = subStringList.stream().max(Comparator.comparing(String::length)).get();
        System.out.println(s2);
        List<String> sortedList = subStringList.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(sortedList);
    }

    public static Boolean checkContineousCharacter(String s){
        char[] charArr = s.toLowerCase().toCharArray();
        Boolean b = false;
        char ch = charArr[0];
        for(int i = 1;i<charArr.length;i++){

            if(ch+1 == charArr[i]){
                ch = charArr[i];
                b = true;
            }else{
                b = false;
                break ;
            }

        }
        return b;
    }
    public static List<String> getAllSubStringofContineousCharacters(String s){
        List<String> subStringList1 = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            String newStrb = "";
            for(int j=i;j<s.length();j++){
                newStrb = newStrb+s.charAt(j);
//                System.out.println(newStrb);
                if(checkContineousCharacter(newStrb)){
//                    System.out.println(newStrb);
                    subStringList1.add(newStrb);
                }

            }

        }
        return subStringList1;
    }


}
