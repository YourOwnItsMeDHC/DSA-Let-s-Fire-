package com.functions;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = in.next();

        System.out.println();                            //lne spacing

        String greetMsg = greeting(name);
        System.out.println(greetMsg);
    }

    static String greeting(String name){
       String message = "Hello " + name + " , Have a nice Day!";
       return message;
    }
}

    /*
    Ask to enter name in variable name.
    Then print whatever is there in variable greetMsg , which is holding method greeting() .
    In method greeting() , it is printing greeting message but asking for name to add in that message , and that
    name is taken as input in variable name
     */