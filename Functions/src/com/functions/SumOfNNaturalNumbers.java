package com.functions;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Write a function that returns the sum of first n natural numbers

        System.out.print("Sum of how many first N natural numbers you want : ");
        int num = in.nextInt();

        in.close();

        System.out.println(sumOfNatural(num));
    }

    static int sumOfNatural(int n){
        int i, sum = 0;
        for(i=1; i<=n; i++){
            sum += i;

            //line 22 to line 27 is just to beautify output
            if(i == n){
                System.out.println(i + " = ");
                continue;
            }
            System.out.print(i + " + ");

        }

        return sum;
    }
}
