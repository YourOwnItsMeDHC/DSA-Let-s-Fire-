package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class CeilingOfAnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //It is same Question as "Floor of a number"
        //Ceiling = smallest element in an array, which is greater than or equal to target element
        //If element not found in that array, return next greater element than target.
        //nums = [2, 4, 8, 14, 18, 22, 90]
        // Eg: target=15 -> not found -> But, in array next greater element than 15 is 18 -> return 18
        //If target is found at mid, return target, but if target is not found in mid, return nums[start],
        // and nums[start] we will get when "while" loop will end
        //If target found                        : start(ceiling) target(somewhere in between) end(floor)  -> return target
        //If target not found("while" terminates : end(floor) start(ceiling)                               -> return nums[start]

        //Return index of target element if found, or else return -1
        int[] nums = {2, 5, 9, 12, 45, 54, 98, 122, 545, 1553};        //Ascending Sorted Array
        System.out.println("Array Given As : ");
        System.out.println(Arrays.toString(nums));

        System.out.println();
        System.out.print("Enter Target Element Looking At Above Array, Whose Ceiling Value You Wanna Know : ");
        int target = in.nextInt();

        int ans = ceiling(nums, target);
        System.out.println();
        System.out.println("Ceiling Value Of " + target + " is present at index " + ans);
//        System.out.println("Ceiling Value Of " + target + " is " + nums[ans] + " , present at index " + ans);
    }

    static int ceiling(int[] nums, int target) {

        //Edge Case: If target is greater than the greatest element in an array. Eg: 1554
        //In an array, there is no any element which is greater than 1554 and not even it have 1554
        if(target > nums[nums.length-1]) {
            return -1;                             //It means there no any ceiling value for target provided
        }

        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            int mid = start + (end-start)/2;

            if(target < nums[mid]) {
                end = mid-1;
            }
            else if(target > nums[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        //"while" loop terminated -> start = end+1 -> end(floor), start(ceiling)
        return start;
    }
}
