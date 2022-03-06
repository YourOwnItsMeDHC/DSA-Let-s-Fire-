package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaxIn2Darray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Array is : ");
        int[][] num = {
                {4, 654, 45, 5445},
                {74, 687, 7486, 574, 54},
                {5465, 54},
                {5},
                {244, 45, 44}
        };

        for(int[] row : num) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();

        System.out.println("Initially Before Traversing Through 2D Array Max was : " + Integer.MIN_VALUE);

        System.out.println("Max Element is : " + max(num));
    }

//    static int max(int[][] num) {
//        int max = Integer.MIN_VALUE;              //Initially, or max = [0][0] i.e. first element in an Array
//        for (int row = 0; row < num.length; row++) {
//            for (int col = 0; col< num[row].length; col++) {
//                if(num[row][col] > max) {
//                   max = num[row][col];
//                }
//            }
//        }
//        return max;
//    }


    //Using "enhanced for' loop :
    static int max(int[][] num) {
        int max = Integer.MIN_VALUE;              //Initially, or max = [0][0] i.e. first element in an Array
        for (int[] row : num) {
            for (int elementInRow : row) {
                if(elementInRow > max) {
                    max = elementInRow;
                }
            }
        }
        return max;
    }
}
