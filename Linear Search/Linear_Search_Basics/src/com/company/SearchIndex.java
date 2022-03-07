package com.company;

import java.util.Scanner;

public class SearchIndex {

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

        int ans = linearSearch(nums, target);
        System.out.print(target + " is present at Index : " + ans);
    }

    static int linearSearch(int[] nums, int target) {
        if(nums.length == 0) {
            return -1;
        }

        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] == target) {
                return i;
            }
        }

        //If after searching in whole Array, Element not found i.e. not present, so just return -1
        return -1;
    }
}
