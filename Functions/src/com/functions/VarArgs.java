package com.functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        //Variable Length Arguments

        var(1, 12, 3, 4, 46, 65465, 4654, 5485, 878);      //with more than zero arguments

        System.out.println();                                   //line spacing

        var();                                                  //with zero argument

        System.out.println();                                   //line spacing

        //normal argument along with keyword or variable argument as well
        multipleAruments(10, 20, "Deepak", "Suraj");
    }

    static void var(int...arr){
        System.out.println(Arrays.toString(arr));             //Convert Arrays into String
    }

    //variable length argument should be declare at last in the list
    static void multipleAruments(int a, int b, String...name){
        System.out.println(a + b);
        System.out.println();
        System.out.println(Arrays.toString(name));;
    }
}

     /*
     A method with variable length arguments(Varargs) in Java can have zero or multiple arguments.
     Variable length arguments are most useful when the number of arguments to be passed to the method is not known beforehand.
     They also reduce the code as overloaded methods are not required.
      */

     //Syntax
    /*
    functionName(data_type three_dots any_name){
          body
          }

          any_name is called implicitly as an array of whatever data_type we chose
     */