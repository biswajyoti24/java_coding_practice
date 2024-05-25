package com.example.demo1.practiceProgrammes;

public class practice3 {
    public static void main(String[] args){
        int arr[] = {1, -3, 4, -2, -1, 6};
        int k = 4;
        int prevsum = 0;
        int result[] = new int[k];
        int subarr[] = new int[k];
        for(int i=0;i<arr.length;i++){
            if(i+k>arr.length){
               break;
            }else{
                for(int j=i;j<k+i;j++){
                    subarr[j-i] = arr[j];

                }
            }

            int sum = 0;

            for(int a=0;a<subarr.length;a++){

                sum = sum + subarr[a];
//
            }

            if(sum>prevsum){
                prevsum = sum;

                result = subarr;

            }

        }
        System.out.print("   [");
        for(int a=0;a<result.length;a++){

            System.out.print( result[a]);

            if(a<subarr.length-1){
                System.out.print( ",");
            }
        }
        System.out.print( "] ans sum is : "+prevsum);
    }
}
