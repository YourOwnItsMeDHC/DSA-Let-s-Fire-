package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Print2DArrOfVarColLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Print 2D Array , having variable length of Columns

        //Below is the 2D Array , passed as an input
        int[][] arr = {
                {1, 2, 3, 4},                    //Whole Array is an element at index 0 of 2D array named as "arr"
                {10, 20},
                {100, 200, 300, 400, 500},
                {1000},
                {11, 12, 13}
        };

        //Output : Using Enhanced "for" loop , and Array.toString() Method from Class "Array"
        for(int[] elementOfRow : arr){
            System.out.println(Arrays.toString(elementOfRow));
        }

//        //Using "for" loop
//        for(int row=0; row<arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
    }
}
