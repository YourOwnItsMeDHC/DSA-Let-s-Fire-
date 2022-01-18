package com.functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = in.nextInt();

        in.close();                               //Close the Scanner Class
        System.out.println(factorial(num));
    }

    static int factorial(int n){
        int i, fact = 1;
        for(i=n; i>=1; i--){
            fact *= i;
        }
        return fact;
    }
}

    /*
    Write a program to print the factorial of a number by defining a method named 'Factorial'.
    Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-

        4! = 1 * 2 * 3 * 4 = 24
        3! = 3 * 2 * 1 = 6
        2! = 2 * 1 = 2
        Also,
        1! = 1
        0! = 1

     */