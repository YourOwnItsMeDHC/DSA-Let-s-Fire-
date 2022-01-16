package com.functions;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
        fun(100);

        fun("Deepak");

       int ans1 = sum(10, 20, 30);
        System.out.println(ans1);

        System.out.println();                        //line spacing

        int ans2 = sum(10, 20, 30, 40);
        System.out.println(ans2);

        System.out.println();                        //line spacing

        var(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

        var("Deepak", "Suraj", "Rapper", "Dancer");
    }

    static void fun(int a){
        System.out.println("From fun() having integer input");
        System.out.println(a);
        System.out.println();
    }

    static void fun(String a){
        System.out.println("From fun() having String input");
        System.out.println(a);
        System.out.println();
    }

    static int sum(int a, int b, int c){
        System.out.println("From sum(), having 3 values (" + a + " ," + b + " ," + c + ") for integer input");
        return a + b + c;
    }

    static int sum(int a, int b, int c, int d){
        System.out.println("From sum(), having 4 values (" + a + " ," + b + " ," + c + " ," + d + ") for integer input");
        return a + b + c + d;
    }

    static void var(int...a){
        System.out.println("From var() , having input as an array of Integer");
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    static void var(String...a){
        System.out.println("From var() , having input as an array of String");
        System.out.println(Arrays.toString(a));
        System.out.println();
    }
}

      /*
      Method overloading is a feature of Java in which a class has more than one method of the same name
      and their parameters are different.

      We can have more than one method of the same name , if the number of arguments or
      the data type of the arguments is different on the parameters of methods.
       */
