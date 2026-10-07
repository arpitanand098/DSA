package com.arpit;

import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int first = in.nextInt();

        System.out.print("Enter Second Number: ");
        int second = in.nextInt();

        System.out.print("Enter Third Number: ");
        int third = in.nextInt();

        int largest = largest(first, second, third);
        System.out.println("largest of three numbers " + first + "," + second + "," + third + " is : " + largest);
        int smallest = smallest(first, second, third);
        System.out.println("smallest of three numbers " + first + "," + second + "," + third + " is : " + smallest);


    }
//    Problem: Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.


    static int smallest(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        }
        if (third < min) {
            min = third;
        }
        return min;

    }

    static int largest(int first, int second, int third) {
        int max = first;
        if(second > max) {
            max = second;
        }
        if(third > max) {
            max = third;
        }
         return max;
     }
}
