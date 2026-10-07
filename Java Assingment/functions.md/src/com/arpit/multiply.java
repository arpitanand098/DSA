package com.arpit;

// 5) Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();

        System.out.print("Enter second number: ");
        int b = in.nextInt();

        int ans = product(a, b);
        System.out.println(ans);
    }

    static int product(int a, int b) {
        return a * b;
    }
}
