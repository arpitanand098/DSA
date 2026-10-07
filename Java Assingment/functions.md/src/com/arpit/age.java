package com.arpit;

import java.util.Scanner;

// 3) A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

public class age {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please Enter Your Age: ");
        int age = in.nextInt();

        boolean isEligible = isEligible(age);

        if (isEligible) {
            System.out.println("You are eligilbe to vote");
        }
        else {
            System.out.println("You are not eligible to vote");
        }



    }

     static boolean isEligible(int age) {
        return age >= 18;
    }
}
