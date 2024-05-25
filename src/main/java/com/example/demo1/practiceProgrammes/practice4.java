package com.example.demo1.practiceProgrammes;

public class practice4 {
    public static void main(String[] args){
        int arr[] = {10,12,3,5,4,9};
        int result[] = new int[arr.length];
        System.out.print("Result output [");
        for(int i=0;i<arr.length;i++){
            int min = NearestMinimumElemnt(arr, i);
            if(i==arr.length-1){
                System.out.print(min+" ] ");
            }else{
                if(min==0){
                    result[i] = -1;
                    System.out.print(-1+" , ");
                }else{
                    result[i] = min;
                    System.out.print(min+" , ");
                }

            }

        }

    }

    public static int NearestMinimumElemnt(int[] arr, int k){
        int min = -1;
        int[] res = arr;
        for(int i=0;i<k;i++){
            if(i==k){
                continue;
            }
            if(arr[i]<arr[k]){
                min = arr[i];
            }
        }
        return min;
    }
}
