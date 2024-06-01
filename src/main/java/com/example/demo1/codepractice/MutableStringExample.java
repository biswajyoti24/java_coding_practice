package com.example.demo1.codepractice;

public class MutableStringExample {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Program Files");
        sbf.append("jgkjfk");
        System.out.println(sbf);
        sbf.delete(13,14);
        System.out.println(sbf);
        sbf.reverse();
        System.out.println(sbf);
        System.out.println(sbf.toString().equals("Program Files"));

    }
}
