package com.example.demo1.ReversingStrings;

public class StringReverse {
    public static void main(String[] args){
        String str = "Hello World";
        String usingForLoop = usingByForLoop(str);
        System.out.println("Reverse string using usingForLoop : "+usingForLoop);
        String usingStringBuilder = usingByStringBuilder(str);
        System.out.println("Reverse string using usingStringBuilder : "+usingStringBuilder);
        String usingRecursion = usingByRecursion(str);
        System.out.println("Reverse string using usingRecursion : "+usingRecursion);
        String usingStringBuffer = usingByStringBuffer(str);
        System.out.println("Reverse string using usingStringBuffer : "+usingStringBuffer);
        String usingWhileLoop = usingByWhileLoop(str);
        System.out.println("Reverse string using usingWhileLoop : "+usingWhileLoop);

    }

    public static String usingByForLoop(String str){
        String result = "";
//        for(int i=str.length()-1;i>=0;i--){
//            result = result + str.charAt(i);
//        }
//        return result;
        for(char i : str.toCharArray()){
            result = i+result ;

        }

        return result;
    }

    public static String usingByStringBuilder(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String usingByRecursion(String str){
        if(str.length() == 0){
            return str;
        }else{
            return usingByRecursion(str.substring(1)) + str.charAt(0);
        }
    }

    public static String usingByStringBuffer(String str){
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }

    public static String usingByWhileLoop(String str){
        String result = "";
        int i = str.length();
        while(i>0){
            result = result + str.charAt(i-1);
            i--;
        }
        return result;
    }
}
