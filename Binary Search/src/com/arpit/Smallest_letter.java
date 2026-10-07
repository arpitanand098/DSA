package com.arpit;

public class Smallest_letter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        char ans = (char) smallestLetter(letters,target);
        System.out.println(ans);

    }
    //return the index

    static char smallestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;


        while (start <= end) {
            //find the middle element
//            int mid = (start + end)/ 2; // might be possible that start + end exceeds the range of integer
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
