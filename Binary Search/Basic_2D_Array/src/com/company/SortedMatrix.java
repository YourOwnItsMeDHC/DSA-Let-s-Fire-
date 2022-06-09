//https://www.geeksforgeeks.org/search-element-sorted-matrix/

// Q: Search in sorted matrix
//Sorted matrix is a matrix, in which first element of any particular row is greater than last element of previous row
//Approach 1 : Linear Search
//Approach 2 : Convert these 2D Matrix into 1D Array, and then apply Binary Search

package com.company;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("Target is at index : "
                           + Arrays.toString(searchMatrix(matrix, 100)));
    }

    //Search in a particular row provided, in between particular columns provided
    //binarySearch(which 2D Array, in which row, from which col, till which col, what is the target)
    static int[] binarySearch(int[][] matrix, int row, int startCol, int endCol, int target) {
        while(startCol <= endCol) {
            int mid = startCol + (endCol - startCol) / 2;

            if(matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            else if(matrix[row][mid] < target) {
                startCol = mid + 1;
            }
            else {                                       //matrix[row][mid] > target
                endCol = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }




    static int[] searchMatrix(int[][] matrix, int target) {
//        Edge Case: There might be the case, where only 1 row is there, which means,
//        it's simply a 1D Array, jo ki 2D Array ka roop badal ke aaya hai, so just simply apply Binary Search
        int row = matrix.length;
        int col = matrix[0].length;                                         //Be cautious, matrix may be empty
        if(row == 1) {
            return binarySearch(matrix, 0, 0, col-1, target);
        }

        //1. Find middle column
        //2. Apply Binary Search on middle column
        //3. On the basis of 2. eliminate rows, until only two rows are left
        int startRow = 0;
        int endRow = row - 1;                    //or matrix.length -1
        int middleCol = col/2;                   //These col is fixed, it's our reference col

        //Run "while" loop until only two rows are remaining :
        //Assume end=6, so end-1=6-1=5
        //So, here start < end-1, which means loop will run till end=4, so we will left with 6-4= "2 rows" at last
        while(startRow < endRow-1) {
            int midRow = startRow + (endRow - startRow) / 2;

            if(matrix[midRow][middleCol] == target) {
                return new int[]{midRow, middleCol};
            }
            else if(matrix[midRow][middleCol] < target) {
                //It means, elements before these midRow is also smaller than target, so just ignore that
                startRow = midRow;
            }
            else {                                          //matrix[midRow][middleCol] > target
                //It means, elements after these midRow is also greater than target, so just ignore that
                endRow = midRow;
            }
        }

        //Now, after these "while" loop, we are left with 2 rows
        //Now, target can be at 5 possible places
        //1, 2, 3, 4 : In one of the 4 sides of these fixed middle column
        //5. In that fixed middle column

        //Check whether the target is in that fixed middle column of 2 rows :
        //Check at First Row :
        if(matrix[startRow][middleCol] == target) {
            return new int[]{startRow, middleCol};
        }
        //Check at Second Row :
        if(matrix[startRow + 1][middleCol] == target) {
            return new int[]{startRow + 1, middleCol};
        }

        //Search in 1st half :
        if(target <= matrix[startRow][middleCol-1]) {
            return binarySearch(matrix, startRow, 0, middleCol-1, target);
        }

        //Search in 2nd half :
        else if(target >= matrix[startRow][middleCol+1] && target <= matrix[startRow][col-1]) {
            return binarySearch(matrix, startRow, middleCol+1, col-1, target);
        }
        //Search in 3rd half :
        else if(target <= matrix[startRow+1][middleCol-1]) {
            return binarySearch(matrix, startRow+1, 0, middleCol-1, target);
        }
        //Search in 4th half :
        else {                                                        //target >= matrix[startRow+1][middleCol+1]
            return binarySearch(matrix, startRow+1, middleCol+1, col-1, target);
        }
    }


}
