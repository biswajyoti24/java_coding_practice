package com.example.demo1.codepractice;

import java.util.*;
import java.util.stream.Collectors;

public class AllPossibleStringOfAString {
    public static void main(String[] args) {
        String s = "abacdefcdga";
        List<String> subStringList = new ArrayList<>();
        subStringList = getAllPossibleSubString(s);

//        System.out.println(subStringList);

        String s2 = subStringList.stream().max(Comparator.comparing(String::length)).get();

        System.out.println(s2.length());
    }

    public static Boolean checkNonRepeatingCharacter(String s){
       Boolean b = true;
        for(int i = 0 ; i < s.length();i++){
            int count = 0;
            for(int j = 0 ; j < s.length();j++)
            if(s.charAt(i) == s.charAt(j)){
                count ++;
            }
            if(count>1){
                b= false;

                return b;

            }else{
                b= true;
            }
        }
       return  b;
    }
    public static  List<String> getAllPossibleSubString(String s){
        List<String> subStringList1 = new ArrayList<>();
        for(int i = 0 ;i<s.length();i++){
            String newString = "";
            for(int k = i ; k<s.length();k++){
                newString = newString+s.charAt(k);
               /* String newString = "";
                for(int j=k;j<s.length();j++){
                    newString = newString+s.charAt(j);
                }
                System.out.println(newString);*/
//                System.out.println(newString);
                if(checkNonRepeatingCharacter(newString)){
                    subStringList1.add(newString);
                }

            }




        }
        return  subStringList1;
    }
}
