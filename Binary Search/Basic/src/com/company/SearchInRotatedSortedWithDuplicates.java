package com.company;

import java.util.Arrays;
import java.util.Scanner;

//Q: Search target in rotated sorted array, which is having duplicate elements
//These question is an advancement or modification of 33. Search in Rotated Sorted Array i.e.
//https://leetcode.com/problems/search-in-rotated-sorted-array/

public class SearchInRotatedSortedWithDuplicates {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Return index of target element if found , or else return -1
        int[] nums = {2, 9, 1, 2, 2, 2};        //Without rotation : 1, 2, 2, 2, 2, 9
        System.out.println("Array Given As : ");
        System.out.println(Arrays.toString(nums));

        //Pivot Location :
        System.out.println("Pivot is at index : " + findPivotWithDuplicates(nums));

        System.out.println();
        System.out.println("It Will Return index of target element if found, or else return -1");  //For my understanding purpose and future reference

        System.out.println();
        System.out.print("Enter Target Element Looking At Above Array : ");
        int target = in.nextInt();

        System.out.println("Target is present at : " + result(nums, target));

    }





    static int result(int[] nums, int target) {
            int pivot = findPivotWithDuplicates(nums);

    //If we didn't find pivot, it means array is not rotated
        if(pivot ==-1){
        //Here, just apply simple Binary Search
        return binarySearch(nums, target, 0, nums.length - 1);
        }

    //If pivot is found, we have 2 ascending arrays (at left and right of pivot)
        if(nums[pivot]==target) {
        return pivot;
        }

    //After pivot i.e. elements at right of pivot are smaller than start element
        if(target >=nums[0]){
        //Then, check at left part of pivot
        return binarySearch(nums, target, 0, pivot - 1);
        }
        else {                                  //target < nums[start]
        //Then check at right part of pivot
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
       }

    }





    //Method for finding Pivot/Peak/Largest Elementm :
    static int findPivotWithDuplicates(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = start + (end-start)/2;

            //For finding pivot, we have 4 cases here :
            if(mid < end && nums[mid] > nums[mid+1]) {                          //Case ; 1
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]) {                        //Case ; 2
                return mid-1;
            }

            //If element at mid, start, end are same, then just skip or ignore that , because they are duplictes as same as mid.
            //Solution : Just move to next element of start and previous element of end.
            if(nums[start] == nums[mid] && nums[end] == nums[mid]) {

                //But, before ignoring it, just check it, because there may be the case where these elements can be the PIVOT
                //Check if start is pivot : (Using Case-1)
                //In case-1, we were checking whether mid is pivot or not, here we are checking whether start is pivot or not, so in place of mid just write start, as it is same like case-1
                if(nums[start] > nums[start+1]) {
                    return start;
                }
                start++;

                //Check if end is pivot : (Using Case-2)
                //In case-2, we were checking whether mid-1 is pivot or not, here we are checking whether end-1 is pivot or not, so in place of mid-1 just write end-1, as it is same like case-2
                if(nums[end-1] > nums[end]) {
                    return end;
                }
                end--;
            }
            else if(nums[mid]>nums[start]  || nums[mid] == nums[start] && nums[mid] > nums[end]) {    //Then go to right side
                /*
                Either 1 or 2 has to be true, and 3 has definetely be true
                1: It means pivot will definetely be not at left, so check at right
                2: It means element in between start and mid will also be same i.e
                   4, 4, 4, 5, 1,2            start = 0, mid=3 , here between elements is also same, so just check at right
                3: If mid is greater than end, and here end is the last element, it means pivot is somewhere outside of end of these particular chunk, so check at another chunk i.e. at right side
                 */
                start = mid+1;
            }
            else {                                                                                    //Then go to left side
                end = mid-1;
            }
        }
        return -1;
    }





    //Method of Binary search :
    static int binarySearch(int[] nums, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(target < nums[mid]) {
                end = mid-1;
            }
            else if(target > nums[mid]) {
                start = mid+1;
            }
            else {                            //start == nums[mid]
                return mid;
            }
        }
        return -1;                           //Target is not present
    }
}
