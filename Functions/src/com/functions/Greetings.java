package com.functions;

public class Greetings {
    public static void main(String[] args) {
        greetings();                                    //void return type

        String message = greet();                       //String return type
        System.out.println(message);
            }

    static void greetings() {
        System.out.println("These message is from greetings() method");
    }

    static String greet(){
        String greeting = "These message is from greet() method";
        return greeting;
    }
}
