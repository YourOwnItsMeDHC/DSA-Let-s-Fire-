package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MinIn2Darray {
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

        System.out.println("Initially Before Traversing Through 2D Array Min was : " + Integer.MAX_VALUE);

        System.out.println("Min Element is : " + min(num));
    }

//    static int min(int[][] num) {
//        int min = Integer.MAX_VALUE;              //Initially, or min = [0][0] i.e. first element in an Array
//        for (int row = 0; row < num.length; row++) {
//            for (int col = 0; col< num[row].length; col++) {
//                if(num[row][col] < min) {
//                   min = num[row][col];
//                }
//            }
//        }
//        return min;
//    }


    //Using "enhanced for' loop :
    static int min(int[][] num) {
        int min = Integer.MAX_VALUE;              //Initially, or max = [0][0] i.e. first element in an Array
        for (int[] row : num) {
            for (int elementInRow : row) {
                if(elementInRow < min) {
                    min = elementInRow;
                }
            }
        }
        return min;
    }
}
