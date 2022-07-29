//Make sure to check it out : https://stackabuse.com/how-to-format-a-string-in-java-with-examples/

package com.company;

public class PreetyPrinting {

    public static void main(String[] args) {

        //Print the value of Pi :
        System.out.println(Math.PI);       //3.141592653589793
        System.out.println();

        //The printf() method of Java PrintStream class is a convenience method which is used to write a String which is formatted to this output Stream.
        // //It uses the specified format string and arguments to write the string.
        //Print only two digits which are after the decimal point of Pi value :
        System.out.printf("%.2f", Math.PI);  //3.14
        System.out.println();
        System.out.println();

        // "%" is the operator , ".2f" means I want two digits which are after the decimal point(float) of Pi value
        //%f ==> float
        //%s ==> string

        System.out.printf("Hey %s your own it's me %s", "everyone", "Deepak Chourasiya"); //Hey everyone your own it's me Deepak Chourasiya


    }
}


/*
There are many format specifiers we can use. Here are some common ones:

%c - Character
%d - Decimal number (base 10)
%e - Exponential floating-point number
%f - Floating-point number
%i - Integer (base 10)
%o - Octal number (base 8)
%s - String
%u - Unsigned decimal (integer) number
%x - Hexadecimal number (base 16)
%t - Date/time
%n - Newline
 */
