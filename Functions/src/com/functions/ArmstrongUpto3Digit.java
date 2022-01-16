package com.functions;

import java.util.Scanner;

public class ArmstrongUpto3Digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Print all armstrong of 3 digits

        System.out.println("To know the Armstrong upto 3 digit numbers , enter the input between the range of 3 digit only");
        System.out.print("Enter Initial Range : ");
        int a = in.nextInt();

        System.out.print("Enter Last Range : ");
        int b = in.nextInt();

        armstrong(a, b);
    }

    static void armstrong(int num1, int num2){
        int i, num , rem, armstr = 0;

        for(i=num1; i<=num2; i++){
            num = i;
            armstr = 0;

            while(num > 0){
                rem = num % 10;
                num = num / 10;
                armstr = armstr + (rem * rem * rem);
            }
            if(armstr == i){
                System.out.println(i + " is Armstrong");
            }
        }
    }
}
