package com.company;

public class b910Palindrome {
    public static void main(String[] args) {

        //Simply, reverse the number, and check whether that original number is same to these reversed number or not
        System.out.println(palindrome(1231));

    }

    static boolean palindrome(int n) {
        return n == rev(n);
    }






    static int rev(int n) {           //Using approach-2 of reversing a number   , See Notes-32
        int digits = (int)(Math.log10(n)) + 1;                           //Digit of n = log10(n)+1

        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        //Base Case : If number is a single digit, then reverse will also be the same
        if(n%10 == n) {                        //OR n < 10
            return n;
        }

        int rem = n%10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
}
