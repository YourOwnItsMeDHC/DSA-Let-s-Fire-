package com.functions;

import java.util.Scanner;

public class ArmstrongUpto3DigitBoolean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Print all armstrong of 3 digits using Boolean as a data type

        System.out.println("To know the Armstrong upto 3 digit numbers , enter the input between the range of 3 digit only");
        System.out.print("Enter Initial Range : ");
        int a = in.nextInt();

        System.out.print("Enter Last Range : ");
        int b = in.nextInt();

        int i;

        for (i = a; i <= b; i++) {
            if (arm(i)) {                                   //if line 21 is true , then run line 22
                System.out.println(i + " is Armstrong");
            }
        }
    }

    static Boolean arm(int n) {
        int temp, rem, armstrong = 0;
        temp = n;

        while (n > 0) {
            rem = n % 10;
            n /= 10;
            armstrong += (rem * rem * rem);
        }

        return armstrong == temp;
    }
}