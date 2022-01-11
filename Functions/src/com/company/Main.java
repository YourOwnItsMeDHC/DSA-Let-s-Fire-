package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Sum Of Two Numbers

        System.out.print("Enter First Number : ");
        int num1 = in.nextInt();

        System.out.print("Enter Second Number : ");
        int num2 = in.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of " + num1 + " and " + num2 + " is : " + sum);
    }
}
