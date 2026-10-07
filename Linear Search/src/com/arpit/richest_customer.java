package com.arpit;

//https://leetcode.com/problems/richest-customer-wealth/

public class richest_customer {
    public static void main(String[] args) {
        int[][] accounts = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }
    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person++ ){
            //when you start a new column, take a new sum for that row
            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++) {
               sum += accounts[person][account];
            }
            // now we have the sum of accounts of person
            // check with overall answer
            if(sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
