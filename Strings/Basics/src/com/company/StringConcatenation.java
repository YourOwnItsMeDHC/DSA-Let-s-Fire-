package com.company;

import java.util.ArrayList;

public class StringConcatenation {
    public static void main(String[] args) {

        System.out.println('a' + 'b'); //195 (i.e. 97+98
        //Above, it's adding because it's character(primitive) , written under ''

        System.out.println("a" + "b"); //ab
        ////Above, it's concatenating because it's string(object) , written under " "

        System.out.println('d' + 5); //105
        //Above 'd' is character(primitive), and 1 is integer(primitive)
        //So, ASCII value of 'd' is 100, therefore 100 + 5 = 105

        //Typecasting the above :
        System.out.println((char)('d'+5)); //i (100+5=105 ==> ASCII of i = 105

        System.out.println("d" + 1);
        //Whenever integer is concatenated/added with string, then it is converted to it's wrapper class integer
        // Internally what happened ? ==> this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        //String with some complex data types (Involving atleast one operand as string) :
        System.out.println("Deepak" + new ArrayList<>()); //Deepak[]

        System.out.println("Deepak" + new Integer(100)); //Deepak100

        //Using + operator for complex data types (Not involving atleast one operand as string) :
//        System.out.println(new Integer(100) + new ArrayList<>()); //error : bad operand types for binary operator '+'

        //But, if I will use atleast one opearand as a string, in that case it will get output properly :
        System.out.println(new Integer(100) + "" + new ArrayList<>()); //100[]
        System.out.println(new Integer(100) + "  " + new ArrayList<>()); //100  []

        System.out.println("d" + 'c'); //dc

    }
}
