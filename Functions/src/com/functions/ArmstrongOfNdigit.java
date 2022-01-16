package com.functions;

import java.util.Scanner;

public class ArmstrongOfNdigit {
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
        int temp, temp2, rem, count = 0, armstrong = 0;
        temp = temp2 = n;

        while(temp>0){
            rem = temp % 10;
            count += 1;
            temp /= 10;
        }

        while(n>0){
            rem = n % 10;
            n/= 10;
            armstrong += (int)(Math.pow(rem , count));
        }

        return armstrong == temp2;
    }
}