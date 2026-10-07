package com.arpit;

import java.util.Scanner;

import static com.arpit.prime.isPrime;


public class all_prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter First number: ");
        int num1 = in.nextInt();

        System.out.print("Enter Second number: ");
        int num2 = in.nextInt();

       checkPrime(num1, num2);
    }

    static void checkPrime(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            if (i <= 1){
                continue;
            }
            boolean isPrime = true;
          for (int j = 2; j*j <= i; j++) {
              if(i % j == 0){
                  isPrime = false;
                  break;

              }
            }
          if(isPrime){
              System.out.print(i + " ");
          }

        }
    }
}
