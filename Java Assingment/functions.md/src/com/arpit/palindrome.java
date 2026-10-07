package com.arpit;

import java.util.Scanner;

// 10) Write a function to find if a number is a palindrome or not. Take number as parameter.

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        boolean ans = check(num);
        if( ans == true) {
            System.out.println(num + " is a palindrome");
        }
        else{
            System.out.println(num + " is not a palindrome");
        }
    }
    static boolean check(int num) {

        int value = 0;
        int temp = num;
        while(temp != 0) {
            value = 10 * value + (temp % 10);
            temp = temp / 10;

            }
        return value == num;
    }

    }

