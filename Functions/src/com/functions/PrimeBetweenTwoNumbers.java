package com.functions;

import java.util.Scanner;

public class PrimeBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Write a function that returns all prime numbers between two given numbers

        System.out.print("Enter Initial Number : ");
        int num1 = in.nextInt();

        System.out.print("Enter Last Number : ");
        int num2 = in.nextInt();

        in.close();

        System.out.println("true means Prime , and false means Not a Prime");
        System.out.println();

        int i;
        for(i=num1; i<=num2; i++){
            System.out.println(i + " is " + prime(i));
        }

    }

    static String prime(int num){
        int c = 2;
        if(num <= 1){
            return "Not A Prime";
        }

        while(c*c < num){
            if(num % c == 0){
                return "Not A Prime";
            }
            else{
                c++;
            }
        }
       if(c*c > num){
           return "Prime";
       }
       else{
           return "Not A Prime";
       }
    }
}
