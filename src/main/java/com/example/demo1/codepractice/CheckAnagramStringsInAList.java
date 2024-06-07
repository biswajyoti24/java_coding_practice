package com.example.demo1.codepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CheckAnagramStringsInAList {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many element do you want to input in tha list");
        int noOfelement = sc.nextInt();
        System.out.println("Insert the element into list ");
        for(int i=0;i<noOfelement;i++){
            String str = sc.next();
            stringList.add(str);
            sc.nextLine();
        }
        System.out.println("String List :  "+stringList);
        for(int i=0;i<noOfelement;i++){
            checkAnagramStrings(stringList.get(i),stringList);
        }
    }
    public static String getAnagramString(String s,String r){
        String result = null;
        int [] count1 = new int[26];
        int [] count2 = new int[26];
        if(s.length() == r.length()){
            for(int i=0;i<s.length();i++){
                count1[s.charAt(i)-'a']++;
            }

            for(int j=0;j<s.length();j++){
                count2[r.charAt(j)-'a']++;
            }


            if(Arrays.equals(count1,count2)){
                result = r;
            }
        }
       return result;
    }
    //jhgjhg, hghgfd, hjghjg
    public static void checkAnagramStrings(String str , List<String> listofstring){

        List<String> anagramStringList = new ArrayList<>();
        int idexOfCurrentElement = listofstring.indexOf(str);
        for(int i=idexOfCurrentElement;i<listofstring.size();i++){
            String anagramString = getAnagramString(str,listofstring.get(i));
            if(anagramString!=null )
            anagramStringList.add(anagramString);

        }
        System.out.println("Anagram String with : "+str+"->"+anagramStringList);

    }
}
