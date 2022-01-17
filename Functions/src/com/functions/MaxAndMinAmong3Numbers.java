package com.functions;

import java.util.Scanner;

public class MaxAndMinAmong3Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Define two methods to print maximum and minimum number respectively among three numbers entered by user.

        System.out.print("Enter First Number : ");
        int num1 = in.nextInt();

        System.out.print("Enter Second Number : ");
        int num2 = in.nextInt();

        System.out.print("Enter Third Number : ");
        int num3 = in.nextInt();

        max(num1, num2, num3);

        min(num1, num2, num3);
    }
    static void max(int a, int b, int c){
        System.out.println("Among " + a + " ," + b + " ," + c);
        System.out.println("Maximum is : " + Math.max(c, Math.max(a, b)));
        System.out.println();
    }

    static void min(int a, int b, int c){
        System.out.println("Among " + a + " , " + b + " , " + c);
        System.out.println("Minimum is : " + Math.min(c, Math.min(a, b)));
    }

}
