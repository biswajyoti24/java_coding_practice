package com.example.demo1.codepractice;

public class CheckAnagramOfTwoString {
    public static void main(String[] args) {
        String s1= "abcfed";
        String s2 = "acbdef";
        checkAnagram(s1,s2);
    }

    public static String sortTheString(String s ){
        char []sCharArr = s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            for (int j = 0; j < s.length() - i - 1; j++) {
                char temp = ' ';
                if (sCharArr[j] > sCharArr[j + 1]) {
                    temp = sCharArr[j ];
                    sCharArr[j] = sCharArr[j+1];
                    sCharArr[j+1] = temp;

                }
            }
        }
        return new String(sCharArr);
    }
    public static void checkAnagram(String s1,String s2){
        String s3 = sortTheString(s1);
        String s4 = sortTheString(s2);
        System.out.println(s3);
        System.out.println(s4);
        if (s3.equals(s4)) {

            System.out.println("The two string are Anagram");
        }else{
            System.out.println("The two string are not Anagram");
        }
    }
}
