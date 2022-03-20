package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Return index of target element if found , or else return -1
        int[] nums = {-10, -8, -6, -4, -2, 0, 2, 4, 6, 8, 10};        //Ascending Sorted Array
        System.out.println("Array Given As : ");
        System.out.println(Arrays.toString(nums));

        System.out.println();
        System.out.println("It Will Return index of target element if found, or else return -1");  //For my understanding purpose and future reference

        System.out.println();
        System.out.print("Enter Target Element Looking At Above Array : ");
        int target = in.nextInt();

        int ans = binarySearch(nums, target);
        System.out.println();
        System.out.println(target + " is present at index : " + ans + " i.e at position (Counting) : " + (ans + 1));
    }


    //Method of finding Index of Target Element Using BINARY SEARCH
    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
//            int mid = (start + end) / 2;              //Will give error: There is a chance that start+end will exceed Integer limit (2147483647)
            int mid = start + (end-start)/2;

            if(target < nums[mid]) {
                end = mid-1;
            }
            else if(target > nums[mid]) {
                start = mid+1;
            }
            else {                                      //if target element == nums[mid] element
                return mid;
            }
        }
        return -1;                                      //After running above while loop, Element not found
    }
}
