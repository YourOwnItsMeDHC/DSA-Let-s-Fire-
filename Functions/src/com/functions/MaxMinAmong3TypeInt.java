package com.functions;

import java.util.Scanner;

public class MaxMinAmong3TypeInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Define two methods to print maximum and minimum number respectively among three numbers entered by user.

        System.out.print("Enter First Number : ");
        int num1 = in.nextInt();

        System.out.print("Enter Second Number : ");
        int num2 = in.nextInt();

        System.out.print("Enter Third Number : ");
        int num3 = in.nextInt();

        System.out.println(max(num1, num2, num3));
        System.out.println(min(num1, num2, num3));

    }

    static int max(int a, int b, int c){
        System.out.println("Maximum Among " + a + " ," + b + " ," + c + " is : ");

        int max = 0;
        if(a>b) {
            max = a;
        } else{
            max = b;
        }

        if(c>max){
            max = c;
        }

        return max;
    }

    static int min(int a, int b, int c){
        System.out.println("Minimum Among " + a + " , " + b + " , " + c + " is : ") ;

        int min = a;
        if(b<min){
            min = b;
        }

        if(c<min){
            min = c;
        }

        return min;
    }
}
