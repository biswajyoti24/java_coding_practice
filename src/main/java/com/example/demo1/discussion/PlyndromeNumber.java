package com.example.demo1.discussion;

import java.util.Scanner;

public class PlyndromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int number = num;
        int polyndromnum = 0;
        while(num > 0) {

            int a = num % 10;
            polyndromnum = polyndromnum * 10 + a;
            num = num / 10;

        }
        if(num == polyndromnum){
            System.out.println("priny anum");
        }else{
            System.out.println("Not Polyndrom num");
        }
    }
}
