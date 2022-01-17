package com.functions;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Define a program to find out whether a given number is even or odd.
        System.out.print("Enter the Number : ");
        int num = in.nextInt();

        System.out.println(evenOdd(num));
    }

    static String evenOdd(int value){
        if(value % 2 == 0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }

//    //Data Type Void
//    static void evenOdd(int value){
//        if(value % 2 == 0){
//            System.out.println(value + " is Even");
//        }
//        else{
//            System.out.println(value + " is Odd");
//        }
//    }

//    //Data Type Boolean
//    static Boolean evenOdd(int value){
//        System.out.println("true means Even and false means Odd");
//       return value % 2 == 0;
//    }

}
