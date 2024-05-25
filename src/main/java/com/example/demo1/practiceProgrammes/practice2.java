package com.example.demo1.practiceProgrammes;

public class practice2 {
    public static void main(String[] args) {
        int[] arr = {1, -3, 4, -2, -1, 6};
        int k = 3;
        int min = 0;
        int max = 0;
        int[] result = new int[k];

        for(int i=0;i<arr.length;i++){
            int[] newremoveelement;
            if (i==0){
                newremoveelement = arr;
            }else{
                newremoveelement = removeindexelement(arr, i);
            }

            int[] newSubarr = findSubarray(newremoveelement, k);
            for(int j=0;j<newSubarr.length;j++){
                max = max + newSubarr[j];

            }

            if (max < min){
                min = max;
            }else{
                result = newSubarr;
                max = 0;
                min=max;

            }
        }

        System.out.print("Maximum sum subarray of length " + k + " is: [");
        for (int i = 0; i < k; i++) {
            System.out.print(result[i]);
            if (i < k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }

    public static int[] removeindexelement(int[] arr, int k) {
        int[] newarr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i<k){
                continue;
            }
            newarr[i] = arr[i];
        }
        return newarr;
    }

    public static int[] findSubarray(int[] arr, int k) {
        if (k > arr.length) {
            System.out.println("Error: k is larger than array length");
            return null;
        }

       int newarr[] = new int[k];
        for(int i=0;i<k;i++){
            newarr[i] = arr[i];
        }
       return newarr;
    }

}
