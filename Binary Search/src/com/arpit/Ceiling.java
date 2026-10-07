package com.arpit;


public class Ceiling {
    public static void main(String[] args) {
        int[] arr ={-42, -38, -36, -20, -18, -3, 0, 2, 3, 4, 6, 8, 10, 14, 17, 20, 35, 26, 28, 42};
        int target = 19;
        int ans = ceiling(arr,target);
        System.out.println(ans);

    }
    //return the index
    // return -1 if it does not exist
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;




        while (start <= end){
            //find the middle element
//            int mid = (start + end)/ 2; // might be possible that start + end exceeds the range of integer
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //answer found
                return arr[mid];
            }
        }

        return arr[start];
    }
}