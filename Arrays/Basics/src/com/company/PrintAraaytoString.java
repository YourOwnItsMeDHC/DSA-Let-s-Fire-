package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class PrintAraaytoString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println(Arrays.toString(arr));     //It will print all as zero, beacuse yet input is not given

        //Take Inputs
        System.out.print("Enter " + arr.length + " Numbers : ");
        int i;
        for(i=0; i<arr.length ; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        //"toString" is the method of Class "Arrays"
    }
}
