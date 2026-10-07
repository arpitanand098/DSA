package com.arpit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int[] arr = {18, 12, 9, 14, 77, 50, 26, 42, 36, 38};
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int target = in.nextInt();

        int ans = search3(arr, target);
        System.out.println(ans);

        }

// search the target and return true or false
         static boolean search2(int[] arr, int target){
            if (arr.length == 0){
                return false;
            }
            for (int element: arr) {
                if( element == target){
                    return true;
                }
            }
             // this line will execute if none of the return statements above have executed
                  // hence the target not found
            return false;
         }

         // search the target and return element

        static int search3(int[] arr, int target){
        if(arr.length == 0) {
            return -1;
        }
        for (int element: arr){
            if( element == target){
                return target;
            }
        }
        // this line will execute if none of the return statements above have executed
            // hence the target not found
        return Integer.MAX_VALUE;
        }

    // search in the array: return the index if item found
    // otherwise if item not found return -1

        static int search(int[] arr, int target){
            if (arr.length == 0) {
                return -1;
            }
            // run a for loop
           for (int i = 0; i < arr.length; i++) {
               // check for element at every index if it is = num
               int element = arr[i];
                if(element == target) {
                     return i;
            }

        }
            // this line will execute if none of the return statements above have executed
            // hence the element not found
            return -1;
        }
    }
