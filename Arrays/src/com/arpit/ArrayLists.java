package com.arpit;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(20);
//        list.add(20);
//        list.add(20);
//        list.add(20);
//        list.add(20);
//        list.add(20);
//        list.add(20);
//        list.add(20);
//        list.add(20);

//        System.out.println(list);
//        list.set(0,55);
//        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }
//        System.out.println(list);
    }
}

