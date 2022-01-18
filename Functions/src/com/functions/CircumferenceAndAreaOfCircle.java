package com.functions;

import java.util.Scanner;

public class CircumferenceAndAreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Program to print circumference and area of a circle of radius entered by user by defining your own method.
        //Area = PI * r^2
        //Circumference = 2 * PI * r

        System.out.print("Enter the Radius : ");
        double radius = in.nextDouble();

        in.close();                               //Closing the Scanner Class

        System.out.println(area(radius));

        System.out.println(circumference(radius));

    }

    static double area(double r){
        System.out.print("Area of radius = " + r + " is : ");
        return Math.PI * (r * r);
        }

    static double circumference(double r) {
        System.out.print("Circumference of radius = " + r + " is : ");
        return 2 * Math.PI * r;
    }

    }
