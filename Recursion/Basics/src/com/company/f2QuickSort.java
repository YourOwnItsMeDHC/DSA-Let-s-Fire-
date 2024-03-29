//Visualization with details :
// https://opendsa-server.cs.vt.edu/ODSA/Books/Everything/html/Quicksort.html

//Article : https://www.geeksforgeeks.org/quick-sort/?ref=leftbar-rightbar

//Hybrid Sorting Algorithm (Tim Sort) :
// https://www.geeksforgeeks.org/timsort/

package com.company;
import java.util.Arrays;
public class f2QuickSort {
    public static void main(String[] args) {
//        int[] nums = {5, 4, 3, 2, 1};
        int[] nums = {35, 50, 15, 25, 80, 20, 90, 45};
        quick(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    //low and high is telling that - in which part of the array we are working on currently OR search space
    static void quick(int[] nums, int low, int high) {
        if(low >= high) {
            return;
        }

        int start = low;
        int end = high;

        int mid = start + (end-start) / 2;
        int pivot = nums[mid];

        while(start <= end) {

            //nums[start] has to smaller element than pivot, if it is, then it's good
            //Otherwise, if it is violating the condition i.e. nums[start] is greater than pivot
            //Which means these particular element which are at nums[start] has to be at right, then just stop iterating
            //and wait for violation of nums[end], after gettin it, just swap them.
            while(nums[start] < pivot) {
                start++;
            }

            //nums[end] has to greater element than pivot, if it is, then it's good
            //Otherwise, if it is violating the condition i.e. nums[end] is smaller than pivot
            //Which means these particular element which are at nums[end] has to be at left, then just stop iterating
            //and here we have violated num[start], so just swap it.
            while(nums[end] > pivot) {
                end--;
            }


            if(start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;

                start++;
                end--;
            }
        }

        quick(nums, low, end);
        quick(nums, start, high);

    }
}

