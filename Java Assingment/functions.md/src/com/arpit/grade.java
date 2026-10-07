package com.arpit;

import java.util.Scanner;

// 08) Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks:

public class grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your Marks: ");
        int marks = in.nextInt();

        String ans = grades(marks);
        System.out.println("The final grade is: " + ans);

                }

    static String grades(int marks) {

        int num = (marks -1) / 10;
        String ans = switch (num) {
            case 9 -> "AA";
            case 8 -> "AB";
            case 7 -> "BB";
            case 6 -> "BC";
            case 5 -> "CD";
            case 4 -> "DD";
            default -> "Fail";
        };

        return ans;
    }
}


