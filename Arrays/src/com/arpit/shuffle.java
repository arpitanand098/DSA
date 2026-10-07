package com.arpit;

import java.util.Arrays;

public class shuffle {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
        int n = nums.length/2;
        int[] ans = Shuffle(nums, n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Shuffle(int[] nums, int n){
        int start = 0;
        int begin = n;
        int index = 0;
        int[] arr = new int[nums.length];


        for (int i =start; i < nums.length/2; i++) {
            arr[index] = nums[start];
            index++;
            start++;

            arr[index] = nums[begin];
            index++;
            begin++;

        }
        return arr;
    }


}
