package com.functions;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Write a function to find if a number is a palindrome or not. Take number as parameter

        System.out.print("Enter any number : ");
        long n = in.nextLong();
        in.close();

        System.out.println(palindrome(n));
    }

    static Boolean palindrome(long num){
        long temp, rem, reverse = 0;
        temp = num;

        while(temp > 0){
            rem = temp % 10;
            temp /= 10;
            reverse = reverse * 10 + rem;
        }
        System.out.println("true means Palindrome , false means not a Palindrome");
        return reverse == num;
    }
}
