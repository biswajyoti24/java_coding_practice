package com.example.demo1.practiceProgrammes;

import java.lang.reflect.Array;
import java.util.List;

public class practice {
    public static int[] maxSubarray(int[] arr, int k) {
        if (k > arr.length) {
            System.out.println("Error: k is larger than array length");
            return null;
        }

        int maxSum = Integer.MIN_VALUE;
        int maxIndex = -1;

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        for (int i = 0; i <= arr.length - k; i++) {
            if (windowSum > maxSum) {
                maxSum = windowSum;
                maxIndex = i;
            }
            if (i + k < arr.length) {
                windowSum = windowSum - arr[i] + arr[i + k];
            }
        }

        int[] result = new int[k];
        System.arraycopy(arr, maxIndex, result, 0, k);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, -3, 4, -2, -1, 6};
        int k = 3;
        int[] result = maxSubarray(arr, k);
        System.out.print("Maximum sum subarray of length " + k + " is: [");
        for (int i = 0; i < k; i++) {
            System.out.print(result[i]);
            if (i < k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
