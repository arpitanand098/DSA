package com.arpit;

import java.util.Scanner;

// 6) Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public class circle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        float r = in.nextFloat();

        double ans = perimeter(r);
        System.out.println("Perimeter: " + ans);

        double ar = area(r);
        System.out.println("Area: " + ar);
    }

     static double area(float r) {
        return 3.14 * r * r;
    }

    static double perimeter(float r) {
        return 2 * 3.14 * r;
    }


}
