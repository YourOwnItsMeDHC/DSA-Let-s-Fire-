package com.company;
//1095. Find in Mountain Array - https://leetcode.com/problems/find-in-mountain-array/
import java.util.Arrays;
import java.util.Scanner;

public class FindInMountainArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Find Peak Index i.e which index is having element as max value
        //Find target at firstHalf/left/ascending part (from index 0 to peak) and return index of target
        //If target not found in left, find target at right (from peak to last index), and return index of target

        int[] nums = {1,2,3,4,5,3,1,6};
        System.out.println("Array is : " + Arrays.toString(nums));

        System.out.print("Enter Target Element : ");
        int target = in.nextInt();                         //Target = 6

        int peak = findPeakIndex(nums);
        System.out.println("Peak Index is : " + peak);

        int firstTry = agnoBS(nums, target, 0, peak);
        if(firstTry != -1) {
            System.out.println("Target is present at index : " + firstTry);
        }
        else {
            int secondTry = agnoBS(nums, target, peak, nums.length-1);
            System.out.println("Target is present at index : " + secondTry);
        }
    }

    //Method of finding peak index :
    static int findPeakIndex(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start < end) {
            int mid = start + (end-start)/2;
            if(nums[mid] > nums[mid+1]) {
                end = mid;
            }
            else {                               //nums[mid] < nums[mid+1];
                start = mid+1;
            }
        }
        return start;
    }

    //Method of Agonstic Binary Search :
    static int agnoBS(int[] nums, int target, int start, int end) {
        //Find whether our Array is sorted in Ascending order or in Descending Order
        boolean isAscending = nums[start] < nums[end];
         while(start <= end) {
             int mid = start + (end-start)/2;

             if(target == nums[mid]) {
                 return mid;
             }

             if(isAscending) {                        //For Ascending Order
                 if(target < nums[mid]) {
                     end = mid-1;
                 }
                 else {                               //target > nums[mid]
                     start = mid+1;
                 }
             }
             else {                                   //For Descendind Order
                 if(target < nums[mid]) {
                     start = mid+1;
                 }
                 else {                               //target > nums[mid]
                     end = mid-1;
                 }
             }
         }
         return -1;
    }

}
