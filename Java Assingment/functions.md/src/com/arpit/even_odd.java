package com.arpit;

import java.util.Scanner;

// 2) Define a program to find out whether a given number is even or odd.

public class even_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please Enter a Number: ");
        int num = in.nextInt();

        even(num);
    }
        static void even(int num){
            if (num % 2 == 0) {
                System.out.println(num + " is an even number");
            }
            else{
                System.out.println(num + " is an odd number");
            }
        }


    }

