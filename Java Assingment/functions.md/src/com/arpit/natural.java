package com.arpit;

// 14) Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;

public class natural {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        int ans = calculate_sum(n);
        System.out.println(ans);
    }

    static int calculate_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {

        }
        return sum;
    }
}