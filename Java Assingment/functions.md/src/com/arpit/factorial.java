package com.arpit;

import java.util.Scanner;

// 9)  Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n!
public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();


        int ans = calculate(n);
        System.out.println(ans);
    }

     static int calculate(int n) {
        int calc = 1;
        for( int i = n; i > 1; i--){
            calc = calc * i;

        }
         return calc;
     }
}
