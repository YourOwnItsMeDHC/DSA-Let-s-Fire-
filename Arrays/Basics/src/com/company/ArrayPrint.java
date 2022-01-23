package com.company;

import java.util.Scanner;

public class ArrayPrint {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Print the inputs of Array

        int[] arr = new int[5];                   //new is the keyword use to create new array objects

        System.out.print("Enter " + arr.length + " Numbers : ");

        int i;

        //Taking Inputs
        for(i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        //Using "for" loop
        System.out.println();
        for(i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();                 //line spacing

        //Using "for each" loop
        for(int num : arr){                //for element of array , store that element in num variable and print it
            System.out.print(num + " ");
        }
    }
}
