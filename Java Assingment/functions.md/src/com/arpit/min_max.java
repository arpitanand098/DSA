package com.arpit;

import java.util.Scanner;

// 1) Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

public class min_max {

        public static void main(String args[]) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome in Java program to find largest and smallest of three numbers");

            System.out.print("Please enter first number :");
            int first = scanner.nextInt();

            System.out.print("Please enter second number :");
            int second = scanner.nextInt();

            System.out.print("Please enter third number :");
            int third = scanner.nextInt();

            int largest = largest(first, second, third);
            int smallest = smallest(first, second, third);

            System.out.println("largest of three numbers " + first + "," + second  + "," + third + " is : " + largest);
            System.out.println("smallest of three numbers " + first + "," + second + "," + third + " is : " + smallest);

        }


         static int largest(int first, int second, int third) {
            int max = first;
            if (second > max) {
                max = second;
            }

            if (third > max) {
                max = third;
            }

            return max;
        }


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
    }


