package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Order Agnostic Binary Search is used when we don't know order i.e whether array is sorted in ascending order or in descending order.

        //Return index of target element if found , or else return -1
        int[] nums = {-10, -8, -6, -4, -2, 0, 2, 4, 6, 8, 10};        //Ascending Sorted Array
//        int[] nums = {10, 8, 6, 4, 2, 0, -2, -4, -6, -8, -10};        //Descending Sorted Array
        System.out.println("Array Given As : ");
        System.out.println(Arrays.toString(nums));

        System.out.println();
        System.out.println("It Will Return index of target element if found, or else return -1");  //For my understanding purpose and future reference

        System.out.println();
        System.out.print("Enter Target Element Looking At Above Array : ");
        int target = in.nextInt();

        int ans = orderAgnosticBS(nums, target);
        System.out.println();
        System.out.println(target + " is present at index : " + ans + " i.e at position (Counting) : " + (ans + 1));

    }

    static int orderAgnosticBS(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        //Find whether our Array is sorted in Ascending order or in Descending Order
        boolean isAscending = nums[start] < nums[end];

        while(start <= end) {
            int mid = start + (end-start)/2;

            if(target == nums[mid]) {
                return mid;
            }

            if(isAscending) {                          //If Array is sorted in Ascending or in Increasing Order
                if(target < nums[mid]) {
                    end = mid-1;                      //Check at left, because it is sorted in Ascending Order
                }
                else {                                //It means target > nums[mid]
                    start = mid+1;                    //Check at right, because it is sorted in Ascending Order
                }
            }
            else {                                    //If Array is sorted in Descending or in Decreasing Order
                if(target < nums[mid]) {
                    start = mid+1;                    //Check at right, because it is sorted in Descending Order
                }
                else {                                //It means target > nums[mid]
                    end = mid-1;                      //Check at left, because it is sorted in Descending Order
                }
            }
        }
        return -1;                                   //After running above while loop, Element not found
    }

}


