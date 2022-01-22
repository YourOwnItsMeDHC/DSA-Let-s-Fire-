package com.company;

import java.util.Scanner;
public class PrintArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*   Syntax Of Array
            data_type[] array_name = new data_type[size of an array]
            Declaration              Initialization
            new is the keyword use to create objects of an array.
         */

        int[] arr = new int[10];

        System.out.println("Enter " + arr.length + " Numbers : ");

        int i;
        for(i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
            System.out.print(arr[i] + " ");
        }
    }
}
