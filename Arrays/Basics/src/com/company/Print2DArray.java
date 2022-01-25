package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Print2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Print 2D Array
        //In 2D Array , each index's element is 1D Array itself i.e row

        int[][] arr = new int[3][3];

        System.out.println("Enter the values for 2D Array : ");

        //Take Input
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        //Take Output (Using "for" loop)
        System.out.println("Using for loop : ");
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Using Arrays.toString() : ");
        //Using Arrays.toString()
        for(int row=0; row<arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        System.out.println();
        System.out.println("Using Enhanced for loop and Array.toString()");
        //Using Enhanced "for" loop and Array.toString()
        for(int[] arrOfRow : arr){
            System.out.println(Arrays.toString(arrOfRow));
        }
    }
}
