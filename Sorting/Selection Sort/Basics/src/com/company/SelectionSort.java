//Selection Sort is "Unstable Sort"
//It performs well on smaller Lists/Arrays

package com.company;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

//        int[] nums = {};

//        int[] nums = {1};

//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};           //Best Case : Array already sorted : O(n)

//        //Worst Case : Array sorted in opposite/descending order, so for each element there will be (max)"n"
//        //comparison : O(n^2)
//        int[] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int[] nums = {5, 8, 54, 0, 5, 2, 123, 3};
        System.out.println("Unsorted Array : " + Arrays.toString(nums));
        selectionSort(nums);
        System.out.println("Sorted Array : " + Arrays.toString(nums));

    }

    static void selectionSort(int[] nums) {

        // run the steps n-1 times
        //"i" is counter or pass/iteration counter
        for(int i=0; i<nums.length; i++) {

            // find the max item in the remaining array and swap with correct index
            //Find "max" element from the particular search space, and place that "max" element at the position,
            //where it has to be
            //So, here that "max" element we will keep start placing from right, because here we are sorting it in ascending order
            //and in ascending order , "max" elements is always at last or from last

            //So, here proper/actual position of "max" element will start from last , so firstly find the last position

            //After each searching/pass/iteration, search space is getting reduce, so last position will also get reduce, it will start shifting towards left
            //Therfore, do "length - current iteration count (i) - 1 (because, index starts from 0)" ==> "int last = nums.length-i-1;"
            int last = nums.length-i-1;                   //Index of last position in a particular search space

            //Find "max" element which we have to swap or place that in correct position
            int indexOfMaxElement = getIndexOfMaxElement(nums, 0, last);

            //Now, we have "max" element, which has to be swapped/replaced with "last" position
            swap(nums, indexOfMaxElement, last);
        }
    }


    static int getIndexOfMaxElement(int[] nums, int start, int end) {
        int maxIndex = start;
        for(int i=start; i<=end; i++) {
            if(nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }


    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}



