package com.functions;

public class Messages {
    public static void main(String[] args) {
        greetings();                                    //void return type

        String message = greet();                       //String return type
        System.out.println(message);

       String msgPara =  greetpara("It is a message from greetpara() method.");
        System.out.println(msgPara);
    }

    static void greetings() {
        System.out.println("These message is from greetings() method");
    }

    static String greet(){
        String greeting = "These message is from greet() method";
        return greeting;
    }

    static String greetpara(String msg){
        return msg;
    }
}
