package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Print2dArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Print 2D Array

        int[][] arr = new int[3][3];

        System.out.println("Enter the values for 2D Array : ");

        //Take Input
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        //Take Output
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println();
        //Using Arrays.toString()
        for(int row=0; row<arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
