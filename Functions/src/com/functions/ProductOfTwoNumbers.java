package com.functions;

import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Define a method that returns the product of two numbers entered by user

        System.out.print("Enter the FIRST Number : ");
        int num1 = in.nextInt();
        System.out.print("Enter the SECOND Number : ");
        int num2 = in.nextInt();

        in.close();                                     //Closing the Scanner Class

        System.out.println(product(num1, num2));
    }

    static int product(int a, int b){
        System.out.print("Product of " + a + " and " + b + " is : ");
        return a*b;
    }
}

      /* See Line 16
      It is recommended to always close the Scanner when we are reading a file.
      It ensures that no input or output stream is opened, which is not in use.
       */
