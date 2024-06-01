package com.example.demo1.codepractice;

public class CheckPolindromString {
    public static void main(String[] args) {
        String s = "abcdefedcba";
        if(checkPolindrom(s)){
            System.out.println("String is polyndrom");
        }else{
            System.out.println("String is not polyndrom");
        }


    }

    public static Boolean checkPolindrom(String s){
        Boolean chkpolindron = true;
        int i=0;
        int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)== s.charAt(j)){
                i++;
                j--;
            }
            else{

                return chkpolindron = false;
            }
        }
        return chkpolindron;
    }
}
