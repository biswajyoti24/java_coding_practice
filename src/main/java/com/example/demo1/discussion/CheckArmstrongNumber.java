package com.example.demo1.discussion;

import java.util.Scanner;

public class CheckArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int number1  =  number;
        int number2  =  number;
        int armstrongnumber = 0;
        int count = 0 ;
        while(number2 > 0){
            count = count+1;
            number2 = number2/10;
        }
        while(number1 > 0){
            int a = number1%10;
            armstrongnumber = armstrongnumber+multiplywithlength(a,count) ;
            number1 = number1/10;
        }
        if(armstrongnumber == number){
            System.out.println("given number is Armstrong Number"+armstrongnumber);
        }else{
            System.out.println("given number is not  Armstrong Number : "+armstrongnumber);
        }

    }
    public static int multiplywithlength (int a , int count){
        int b =1 ;
        for(int i =0 ; i<count;i++){
            b= b*a;
        }
        return b;
    }
}
