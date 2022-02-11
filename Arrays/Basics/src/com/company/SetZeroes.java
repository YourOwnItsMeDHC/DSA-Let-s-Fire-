package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SetZeroes {
    public static void main(String[] args) {
        //73. Set Matrix Zeroes (Medium - Array)
        //Brute - Force Approach : (But , it will give error , if element is already negative)

        /* Assuming all the elements in the matrix are non-negative.
        Traverse through the matrix and if you find an element with value 0,
        then change all the elements in its row and column to -1, except when an element is 0.
        The reason for not changing other elements to 0, but -1, is because that might affect other columns and rows.
        Now traverse through the matrix again and if an element is -1 change it to 0, which will be the answer. */

        Scanner in = new Scanner(System.in);

        int[][] matrix = new int[3][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {


                    //Make Elements as -1 in all rows of same column, before the position of 0
                    //Rows will change , column will be the same
                    int index = i - 1;
                    while (index >= 0) {
                        if (matrix[index][j] != 0) {
                            matrix[index][j] = -1;
                        }
                        index--;
                    }

                    //Make Elements as -1 in all rows of same column, after the position of 0
                    //Rows will change , column will be the same
                    index = i + 1;
                    while (index < rows) {
                        if (matrix[index][j] != 0) {
                            matrix[index][j] = -1;
                        }
                        index++;
                    }

                    //Make Elements as -1 in all columns of same row, before the position of 0
                    //Columns will change , row will be the same
                    index = j - 1;
                    while (index >= 0) {
                        if (matrix[i][index] != 0 || matrix[index][j] < 0) {
                            matrix[i][index] = -1;
                        }
                        index--;
                    }

                    //Make Elements as -1 in all Columns of same row, before the position of 0
                    //Columns will change , row will be the same
                    index = j + 1;
                    while (index < cols) {
                        if (matrix[i][index] != 0 || matrix[index][j] < 0) {
                            matrix[i][index] = -1;
                        }
                        index++;
                    }
                }
            }
        }

//Convert all negative (-1) into 0
        for (int k = 0; k < rows; k++) {
            for (int l = 0; l < cols; l++) {
                if (matrix[k][l] <= 0) {
                    matrix[k][l] = 0;
                }
            }
        }

        for(int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}

