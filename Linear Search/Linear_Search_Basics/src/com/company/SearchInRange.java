package com.company;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Size of an Array : ");
        int n = in.nextInt();

        int[] nums = new int[n];

        for(int i=0; i<nums.length; i++) {
            System.out.print("Enter Element For Index " + i + ": ");
            nums[i] = in.nextInt();
        }

        System.out.print("Which Element You Would Like To Search : ");
        int target = in.nextInt();

        System.out.print("Starting Index For Range : ");
        int start = in.nextInt();

        System.out.print("Last Index For Range : ");
        int end= in.nextInt();

        int ans = searchInRange(nums, target, start, end);
        System.out.print(target + " is present at Index : " + ans);

    }
    //Method to search in range :
    static int searchInRange(int[] nums, int target, int start, int end) {
        if(nums.length == 0) {
            return -1;
        }

        for (int i=start; i<=end; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
