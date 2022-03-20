package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class FloorOfAnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //It is same Question as "Ceiling of a number"
        //Floor = greater element in an array, which is smaller than or equal to target element
        //If element not found in that array, return greatest element, which should be smaller than target.
        //nums = [2, 4, 8, 14, 18, 22, 90]
        // Eg: target=15 -> not found -> But, in array greatest element, which should be smaller than 15 is 14 -> return 14
        //If target is found at mid, return target, but if target is not found in mid, return nums[end],
        // and nums[end] we will get when "while" loop will end
        //If target found                        : start(ceiling) target(somewhere in between) end(floor) -> return target
        //If target not found("while" terminates : end(floor) start(ceiling)                              -> return nums[end]

        //Return index of target element if found, or else return -1
        int[] nums = {2, 5, 9, 12, 45, 54, 98, 122, 545, 1553};        //Ascending Sorted Array
        System.out.println("Array Given As : ");
        System.out.println(Arrays.toString(nums));

        System.out.println();
        System.out.print("Enter Target Element Looking At Above Array, Whose Floor Value You Wanna Know : ");
        int target = in.nextInt();

        int ans = floor(nums, target);
        System.out.println();
        System.out.println("Floor Value Of " + target + " is " + nums[ans] + " , present at index " + ans);
    }

    static int floor(int[] nums, int target) {
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
        return end;
    }
}
