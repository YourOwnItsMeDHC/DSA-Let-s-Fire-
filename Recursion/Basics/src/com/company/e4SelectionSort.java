package com.company;
import java.util.Arrays;
public class e4SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        selection(nums, nums.length, 0, 0);
        System.out.println(Arrays.toString(nums));           //[1, 2, 3, 4, 5]
    }

    static void selection(int[] nums, int iteration, int index, int max) {
        if(iteration == 0) {
            return;
        }

        if(index < iteration) {
            if(nums[index] > nums[max]) {
                selection(nums, iteration, index+1, index);
            }
            else {
                selection(nums, iteration, index+1, max);
            }
        }
        else {
            int temp = nums[max];
            nums[max] = nums[iteration-1];
            nums[iteration-1] = temp;
            selection(nums, iteration-1, 0, 0);
        }
    }
}
