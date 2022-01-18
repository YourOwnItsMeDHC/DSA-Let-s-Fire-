package com.functions;

import java.util.Scanner;

public class SumOf2Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Write a program to print the sum of two numbers entered by user by defining your own method.
        System.out.print("Enter the FIRST Number : ");
        int num1 = in.nextInt();

        System.out.print("Enter the SECOND Number : ");
        int num2 = in.nextInt();

        System.out.println(sum(num1, num2));
    }

    static int sum(int a, int b){
        System.out.print("Sum of " + a + " and " + b + " is : ");
        return a+b;
    }
}
