package com.functions;

import java.util.Scanner;

public class PythagoreanTripletOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Write a function to check if a given triplet is a Pythagorean triplet or not.
        //A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the 3rd number

        System.out.print("Enter FIRST Number : ");
        int num1 = in.nextInt();

        System.out.print("Enter SECOND Number : ");
        int num2 = in.nextInt();

        System.out.print("Enter THIRD Number : ");
        int num3 = in.nextInt();

        System.out.println(triplet(num1, num2, num3));
    }

    static boolean triplet(int n1, int n2, int n3){
        int x, y, z;

        x = n1 * n1;
        y = n2 * n2;
        z = n3 * n3;

        return x+y==z || x+z==y || y+z==x;
    }
}
