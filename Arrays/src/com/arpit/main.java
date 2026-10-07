package com.arpit;

public class main {
    public static void main(String[] args) {
        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers;

//        int[] rollno = new int[5];
//        // or directly
//        int[] rollno2 = {36,37,38,39,42};
//
        int[] ros; //declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialisation: actually here object is being created in the heap memory
        System.out.println(ros[4]);

        String[] name = new String[4];
        System.out.println(name[3]);
        


        }
    }
