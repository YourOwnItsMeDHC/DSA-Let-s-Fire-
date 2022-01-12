package com.functions;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        sum();

        //to return int method , we have to store that method in some reference variable , and then print that
        int ansForSum2 = sum2();
        System.out.println("From sum2() , Sum is : " + ansForSum2);

        System.out.println();                                          //line spacing

        int ansForSum3 = sum3(10  , 20);
        System.out.println("From sum3() , Sum is : " + ansForSum3);
    }

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

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = in.nextInt();
        System.out.print("Enter Second Number : ");                //return type "int"
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;                                                //it means last line of method
    }                          //to return int method , we have to store that method in some reference variable


    //Using Parameters
    /*
    In parameters there will be all the things i.e variables whose input we want.
    We need to use Scanner if we want value of some variable as an input ,but here ,
    we can get that input by passing all that variable n parameters of method whose value we need.
     */
    static int sum3(int a , int b){
        int sum = a + b;
        return sum;
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