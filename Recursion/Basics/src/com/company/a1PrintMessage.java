//To understand it in a better way, debug it in Intellij IDEA or using pen and paper
package com.company;
public class a1PrintMessage {
    public static void main(String[] args) {
        message1();
    }

    static void message1() {
        System.out.println("Hey! Deepak");
        message2();
    }

    static void message2() {
        System.out.println("Hey! Deepak");
        message3();
    }

    static void message3() {
        System.out.println("Hey! Deepak");
        message4();
    }

    static void message4() {
        System.out.println("Hey! Deepak");
        message5();
    }

    static void message5() {
        System.out.println("Hey! Deepak");
    }

}















////Below also works , (But it's not an recursion 😁) :
//package com.company;
//public class a1PrintMessage {
//    public static void main(String[] args) {
//        int i = 5;
//        while(i != 0) {
//            message();
//            i--;
//        }
//    }
//
//    static void message() {
//        System.out.println("Hey! Deepak");
//    }
//}
