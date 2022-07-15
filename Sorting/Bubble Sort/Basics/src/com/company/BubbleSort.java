// Bubble sort is "in-sort" , "stable" ==> order of elements is maintaned, and "counting" algorithm
package com.company;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

//        int[] nums = {};

//        int[] nums = {1};

//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};           //Best Case : Array already sorted : O(n)

//        //Worst Case : Array sorted in opposite/descending order, so for each element there will be (max)"n"
//        //comparison : O(n^2)
//        int[] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int[] nums = {5, 8, 54, 0, 5, 2, 123, 3};
        System.out.println("Unsorted Array : " + Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println("Sorted Array : " + Arrays.toString(nums));
    }

    static void bubbleSort(int[] nums) {
        //"swapped" variable : for checking whether swap happened or not
        boolean swapped;

        // run the steps n-1 times
        //"i" is counter or pass/iteration counter
        for(int i=0; i<nums.length; i++) {
            swapped = false;

            // for each step/pass/iteration , max item will come at the last respective index
            //So, for next pass there is no need to check for that index where max item is placed in previous pass
            //So, we will do j < nums.length-i; or j <= nums.length-i-1;
            for(int j=1; j<nums.length-1; j++) {                        // or j <= nums.length-i-1;

                //"Deepak/5" is at "j"th position , "Suraj/10" is at his previous position i.e. "j-1" position
                //i.e. - - - 10 5 - - -
                //          j-1 j
                //Here, 10 has to be at the position of 5, and 5 has to be at the position of 10
                //So, just swap it :
                if(nums[j-1] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;

                    //For a particular "i"th pass/iteration , "j" has swapped (atleast a single time)
                    swapped = true;
                }

            }

            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            //If for a particular "i"th pass/iteration , "j" hasn't swapped even a single time, it means,
            //now array is sorted, so there is no need to make further pass/iteration, so just "break" it :
            if(!swapped) {                                           //swapped == false
                break;
            }
        }
    }
}
