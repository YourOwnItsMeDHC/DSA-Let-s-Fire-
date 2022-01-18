package com.functions;

import java.util.Scanner;

public class GradesAccordingToMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enters the Marks (Out Of 100) : ");
        byte mks = in.nextByte();

        System.out.println(grade(mks));

    }

    static String grade(int marks){
        if (marks <= 100) {
            if(marks>=91 && marks<=100){
                return "AA";
            }
            else if(marks>=81 && marks<=90){
                return "AB";
            }
            else if(marks>=71 && marks<=80){
                return "BB";
            }
            else if(marks>=61 && marks<=70){
                return "BC";
            }
            else if(marks>=51 && marks<=60){
                return "CD";
            }
            else if(marks>=41 && marks<=50){
                return "DD";
            }
            else{
                return "Fail";
            }
        } else {
            return "Invalid Input";
        }
    }
}

       /*
       Write a program that will ask the user to enter his/her marks (out of 100).
       Define a method that will display grades according to the marks entered as below:

       Marks        Grade
      91-100         AA
      81-90          AB
      71-80          BB
      61-70          BC
      51-60          CD
      41-50          DD
      <=40          Fail
        */
