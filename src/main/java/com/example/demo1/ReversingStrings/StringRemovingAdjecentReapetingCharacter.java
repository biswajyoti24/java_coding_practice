package com.example.demo1.ReversingStrings;

public class StringRemovingAdjecentReapetingCharacter {
    public static void main(String[] args){
        String str = "abccba";
        int k = 0;
           String result = "";
           for(char i: str.toCharArray()){
               if(result.length() == 0){
                   result = result + i;
               }else{
                   if(result.charAt(result.length()-1) == i){
                       k=k+1;
                       result = result.substring(0, result.length()-1)+i;
                   }else{
                       result = result + i;
                   }
               }
           }
        System.out.println(k);
    }
}
