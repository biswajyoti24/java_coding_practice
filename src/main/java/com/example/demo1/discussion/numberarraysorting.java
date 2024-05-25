package com.example.demo1.discussion;

import java.util.Scanner;

public class numberarraysorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrsize = sc.nextInt();
        int[] arr = new int[arrsize];
        for(int i=0;i<arrsize;i++){
             arr[i] = sc.nextInt();
        }
        int secondhighest = 0;
        for(int j=0;j<arrsize;j++){
            int temp = arr[j] ;

            for(int k=0;k<arrsize;k++){
                if(temp>arr[k]){
                    temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                }


            }
        }
        for(int j=0;j<arrsize;j++){
            System.out.println(arr[j]);
            secondhighest= arr[1];
        }
        System.out.println(secondhighest);

    }
}
