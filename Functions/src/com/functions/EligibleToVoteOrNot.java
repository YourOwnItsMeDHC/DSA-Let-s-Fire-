package com.functions;

import java.util.Scanner;

public class EligibleToVoteOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //A person is eligible to vote if his/her age is greater than or equal to 18.
        // Define a method to find out if he/she is eligible to vote.

        System.out.print("Enter the Age of Voter : ");
        byte age = in.nextByte();

        System.out.println(eligible(age));
    }

    //Return Type String
    static String eligible(int a){
        if(a >= 18){
            return "Eligible";
        }
        else{
            return "Not Eligible";
        }
    }

//    //Return Type Boolean
//    static boolean eligible(int a){
//        System.out.println("true means Eligible and false means Not Eligible");
//        return a >= 18;
//    }

//    //Return Type Void
//    static void eligible(int a){
//        if(a >= 18){
//            System.out.println("Voter is Eligible To Vote");
//        }
//        else{
//            System.out.println("Voter is Not Eligible To Vote");
//        }
//    }
}
