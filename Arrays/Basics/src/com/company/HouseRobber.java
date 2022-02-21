package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class HouseRobber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Length Of An Array : ");
        int n = in.nextInt();

        System.out.println("You Need To Enter " + n + " Elements : ");
        int[] nums = new int[n];
        for (int i=0; i<nums.length; i++) {
            System.out.println("Enter Element No. " + (i+1) + " : ");
            nums[i] = in.nextInt();
        }

        System.out.println("Maximum Roberry Amount , an Burglar can collect is : ");
        System.out.println(rob(nums, 0));
    }

    static int rob(int[] wealth, int currentIndex) {

        if(wealth.length <= currentIndex) {
            return 0;
        }

        int stealCurrent = wealth[currentIndex] + rob(wealth, currentIndex + 2);
        int skipCurrent = rob(wealth, currentIndex + 1);

        return Math.max(stealCurrent, skipCurrent);
    }
}
