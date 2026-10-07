package com.arpit;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12 , -7, 3, 14, 28};
        System.out.println(min(arr));
    }

   // assume arr.lenth != 0
    // return the minimum element in the array

    static int min(int[] arr) {
        int min_element = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min_element){
                min_element = arr[i];
            }
        }
        return min_element;
    }
}
