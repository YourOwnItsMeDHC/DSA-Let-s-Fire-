package com.company;

import java.util.Scanner;

public class ImprovedLinearSearch {
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

        //Two Ponter Approach :
        int left=0, right=n-1, position=-1;
        while(left < right) {
            if(nums[left] == target) {
                position = left;
                System.out.println(target + " is at index : " + position);
            }
            if(nums[right] == target) {
               position = right;
               System.out.println(target + " is at index : " + position);
            }

            left++;
            right--;
        }
        if(position == -1) {
            System.out.println(target + " is not present in an Array");
        }
    }
}
