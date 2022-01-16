package com.functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        //Variable Length Arguments

        var(1, 12, 3, 4, 46, 65465, 4654, 5485, 878);      //with more than zero arguments

        var();                                                  //with zero argument
    }

    static void var(int...arr){
        System.out.println(Arrays.toString(arr));             //Convert Arrays into String
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

          any_name is called implicitly as ann array of data_type
     */