package com.example.demo1.ReversingStrings;

import java.util.HashSet;
import java.util.Scanner;

public class StringGetPossibleSubstring {
    public static void main (String []args){
        System.out.println("Enter a String TO get Possiblesubstring");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int nindex=0;

        HashSet<String> uniqueSubStr = new HashSet<String>();
        String[] subStr = new String[str.length()*(str.length()+1)/2];
        for(int i=0;i<str.length();i++){
            String s = " ";
            for(int j=i;j<str.length();j++){
                s = s+str.charAt(j);
                String nS = checkString(s);
                subStr[nindex]=s;
                nindex++;
                uniqueSubStr.add(s);
//                System.out.println("substring : "+s);
            }

        }

        System.out.println("length of sub string array is : "+subStr.length);
        for(String s:subStr) {
//            int count = checkOccuranceofsubstring(s, subStr);
//            System.out.println(s + "  " + count);
            int polyndromsubstringCOunt = checkPolindrmSubString(s);
            System.out.println("no of polyndrom string : "+polyndromsubstringCOunt);
        }


        System.out.println(uniqueSubStr);

        System.out.println("End");
    }
    public static String getSubString(int k ,int l,String str){

        String s= "";
        for(int i=k;k<=l;i++){
            s = s+str.charAt(i);

        }
        return s ;
    }
    public static String checkString(String str){
        return str;
    }

    public static int checkPolindrmSubString(String s){
        int count =0;
        String stringReverse = getResverseString(s);
        if(stringReverse.equals(s))
            count++;
        return count;
    }
    public static String getResverseString(String s){
        String reverestring = "";
        /*for(int i=s.length()-1;i>=0;i--){
            reverestring = reverestring+s.charAt(i);
        }*/
        for(char i : s.toCharArray()){
            reverestring = i+reverestring ;

        }

        return reverestring;
    }
    public static int checkOccuranceofsubstring(String s , String[] starr){
        int counter = 0;
        for (int j = 0; j < starr.length; j++)
            if (s.equals(starr[j]))
                counter++;

        return counter;
    }
}
