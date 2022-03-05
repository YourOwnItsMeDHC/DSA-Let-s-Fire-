package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Size of an Array : ");
        int n = in.nextInt();

        int[] nums = new int[n];

        for(int i=0; i<nums.length; i++) {
            System.out.print("Enter Element For Index " + i + ": ");
            nums[i] = in.nextInt();
        }

        int ans = searchMax(nums);
        System.out.println(ans + " is Maximum in the Array : " + Arrays.toString(nums));

    }
    static int searchMax(int[] nums) {
        //Assuming , length of an Array is not zero
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}

