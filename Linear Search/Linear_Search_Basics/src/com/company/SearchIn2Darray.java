package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2Darray {
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

        System.out.print("Enter Target Element : ");
        int target = in.nextInt();

        System.out.println(target + " is present at indices : " + Arrays.toString(searchIn2D(num, target)));
    }

    static int[] searchIn2D(int[][] num, int target) {
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col< num[row].length; col++) {
                if(num[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
