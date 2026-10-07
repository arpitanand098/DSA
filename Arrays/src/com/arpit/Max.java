package com.arpit;

public class Max {
    public static void main(String[] args) {
        int[] arr = {36, 38, 42, 39, 37};
        System.out.println(maxRange(arr, 1, 2));
    }

    // work on edge cases here, like array being null
    static int maxRange(int[] arr, int start, int end) {
        int maxVal = arr[start];

        for (int i = start; i < end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // imagine that array is not empty
    static int max(int[] arr) {
        int maxVal= arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
