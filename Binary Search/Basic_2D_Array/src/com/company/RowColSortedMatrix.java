//See Notes (Page No : 01)
//Q: Search in Row-wise & Column-wise sorted matrix

package com.company;

import java.util.Arrays;

public class RowColSortedMatrix {
    public static void main(String[] args) {

        //n * n matrix :
        int[][] nums = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

//        //m * n matrix :
//        int[][] nums = {
//                {10, 20, 30},
//                {15, 25, 35},
//                {28, 29, 37},
//                {33, 34, 38}
//        };

        System.out.println("Target is present at index : "
                           + Arrays.toString(search(nums, 49)));
    }

    static int[] search(int[][] nums, int target) {
        int row = 0;
        int col = nums.length-1;                    //For n*n matrix
//        int col = nums[row].length-1;               //For m*n matrix

        while(row < nums.length && col >= 0) {
            if(nums[row][col] == target) {
                return new int[]{row, col};
            }
            else if(nums[row][col] < target) {
                row++;
            }
            else {                                  //nums[row][col] > target
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
