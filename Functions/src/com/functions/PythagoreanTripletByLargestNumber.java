package com.functions;

import java.util.Scanner;

public class PythagoreanTripletByLargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter FIRST Number : ");
        int num1 = in.nextInt();

        System.out.print("Enter SECOND Number : ");
        int num2 = in.nextInt();

        System.out.print("Enter THIRD Number : ");
        int num3 = in.nextInt();

        System.out.println(triplet(num1, num2, num3));
    }

    static int largest(int n1, int n2, int n3){
        int max = n1;

        if(n2 > max){
            max = n2;
        }

        if(n3 > max){
            max = n3;
        }

        return max;
    }

    static Boolean triplet(int a, int b, int c){
        int max = largest(a, b, c);

        if(max == a){
          return ((int)(Math.pow(b,2)) + (int)(Math.pow(c,2))) == (int)(Math.pow(a,2));
        }
        else if(max == b){
            return ((int)(Math.pow(a,2)) + (int)(Math.pow(c,2))) == (int)(Math.pow(b,2));
        }
        else{
            return ((int)(Math.pow(a,2)) + (int)(Math.pow(b,2))) == (int)(Math.pow(c,2));
    }
    }
}
       /*
        Pythagoras = Perpendicular^2 + Base^2 = Hypotenuse^2
        Here , we don't know value of Perpendicular , Base , and Hypotenuse
        But , we know that value of Hypotenuse is always largest tha Perpendicular and Base
         */
