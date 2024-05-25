package com.example.demo1.ReversingStrings;

import java.util.Scanner;

public class StringCheckAnagram {
    public static void main(String[] args){
        System.out.println("enter a String");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("Enter another string");
        Scanner sc1 = new Scanner(System.in);
        String str2 = sc1.nextLine();
        System.out.println("The first string is: "+str1);
        System.out.println("The second string is: "+str2);
        if(str1.length()!=str2.length()){
            System.out.println("Not Anagram");
            System.out.println("Dyou want to make them anagram by removing some characters Type 'Y' in command line");
            Scanner sc2 = new Scanner(System.in);
            char ch = sc2.nextLine().charAt(0);
            if(ch == 'Y' || ch == 'y'){
                removeCharectersFromTwoStringToMakeThemAnagram(str1,str2);
            }
//            String str5 = sortString(str1);
//            String str6 = sortString(str2);
//            removeCharectersFromTwoStringToMakeThemAnagram(str5,str6);
        }else{
            String str3 = sortString(str1);
            String str4 = sortString(str2);
            if(str3.equals(str4)){
                System.out.println("the above two string are anagram");
            }
            else {
                System.out.println("Not Anagram");

            }
        }

    }

    public static void removeCharectersFromTwoStringToMakeThemAnagram(String s1,String s2){
        int count1[] = new int[26];
        int count2[] = new int[26];
        for (int i=0;i<s1.length();i++){
            count1[s1.charAt(i)-'a']++;
        }

        for (int i=0;i<s2.length();i++){
            count2[s2.charAt(i)-'a']++;
        }

        StringBuffer sb1 = new StringBuffer();
        for (int i=0;i<s1.length();i++){
           if(count2[s1.charAt(i)-'a'] > 0){
               sb1.append(s1.charAt(i));
               count2[s1.charAt(i)-'a']--;
           }else{

           }
        }

        StringBuffer sb2 = new StringBuffer();
        for (int i=0;i<s2.length();i++){
            if(count1[s2.charAt(i)-'a'] > 0){
                sb2.append(s2.charAt(i));
                count1[s2.charAt(i)-'a']--;
            }else{

            }
        }
        if((sb1.toString().equals(sb2.toString()) || sb1.toString().length()==sb2.toString().length()) && sb1.toString().length()!=0){
            System.out.println("after removing uncommn character the two string are anagram: "+sb1.toString()+" "+sb2.toString());
        }

    }

    public static String sortString(String str){
        char chrArr[] = str.toCharArray();
        char ch = ' ';
        for(int i = 0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
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
