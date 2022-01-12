package com.functions;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        //to return int method , we have to store that method in some reference variable , and then print that

     int ans = sum2();
        System.out.println("From sum2() , Sum is : " + ans);

        System.out.println();                                          //line spacing

        sum();

        int ans2 = sum2();
        System.out.println("From sum2() , Sum is : " + ans2);

        System.out.println();                                          //line spacing

        sum();
    }


    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = in.nextInt();
        System.out.print("Enter Second Number : ");                //return type "int"
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;                                                //it means last line of method
    }                          //to return int method , we have to store that method in some reference variable

        static void sum() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter First Number : ");              //return type "void"
            int num1 = in.nextInt();
            System.out.print("Enter Second Number : ");
            int num2 = in.nextInt();
            int sum = num1 + num2;
            System.out.println("From sum() , Sum of " + num1 + " and " + num2 + " is : " + sum);
            System.out.println();
        }
    }

    //Method Syntax
    /*
    access_modifier  return_type  name(){
    body
    return statement
    }
    */

    /*non-static method sum() cannot be referenced from a static context i.e 6 th line , that's why we use
    static at starting of method .
   "void" is used with the method declaration to specify that this particular method is not going
    to return any value after completing its execution.
    We cant assign the return type of a void method to any variable because void is not a data type.
    */