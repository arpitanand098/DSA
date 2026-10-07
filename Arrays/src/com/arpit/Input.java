package com.arpit;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //array of primitives
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 5;
        arr[3] = 7;
        arr[4] = 8;
        // [2, 4, 5, 7, 8]
//        System.out.println(arr[6]); Index out of bound error

        //input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }

//        for (int j : arr) { // for every element in array, print the element
//            System.out.print(j + " "); // here j represents element of the array
//        }
        // array of objects
        String[] str = new String[5];
        for(int i =0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));
        //modify
        str[1] = "Arpit";
        System.out.println(Arrays.toString(str));


    }
}
