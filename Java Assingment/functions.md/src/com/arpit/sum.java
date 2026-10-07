package com.arpit;

import java.util.Scanner;

// 4) Write a program to print the sum of two numbers entered by user by defining your own method.

public class sum {

    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }

    static int sum() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();

        System.out.print("Enter second number: ");
        int b = in.nextInt();

        return a + b;
    }
}
