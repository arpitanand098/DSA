package com.arpit;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String Name = "Arpit";
        char target = 'r';
//        System.out.println(search(Name, target));
        System.out.println(Arrays.toString(Name.toCharArray()));
    }


    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}