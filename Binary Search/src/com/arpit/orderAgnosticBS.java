package com.arpit;

public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr ={-42, -38, -36, -20, -18, -3, 0, 2, 3, 4, 6, 8, 10, 14, 17, 20, 35, 26, 28, 42};
        int target = 14;
        int ans = OrderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int OrderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending order
        boolean isAsc;
        isAsc = arr[start] < arr[end];

        while (start <= end){
            //find the middle element
//            int mid = (start + end)/ 2; // might be possible that start + end exceeds the range of integer
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }
        }

        return -1;

    }
}
