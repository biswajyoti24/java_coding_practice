package com.example.demo1.ReversingStrings;

import java.util.Scanner;

public class AcceptCommandlineArguements {
    public static void main(String[] args) {
        //accept command line arguements using Scanner class
        System.out.println("enter a String");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("Enter another string");
        Scanner sc1 = new Scanner(System.in);
        String str2 = sc1.nextLine();
        System.out.println("The first string is: "+str1);
        System.out.println("The second string is: "+str2);
    }
}
