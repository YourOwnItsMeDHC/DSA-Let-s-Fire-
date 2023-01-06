//Iterative Bubble Sort :
// https://github.com/YourOwnItsMeDHC/DSA-Let-s-Fire-/blob/master/Sorting/Selection%20Sort/Basics/src/com/company/SelectionSort.java
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

        //Current index should always be smaller than iteration.
        //Because, here iteration value is denoting search space for each respective pass or iteration
        if(index < iteration) {

            //Here, I have to find max element in that particular iteration/pass/search space
            //If element at current index is greater than the max element, assume that index's element as max
            //for now, and pass that element only, as the max element for further checking of max element
            if(nums[index] > nums[max]) {
                selection(nums, iteration, index+1, index);
            }
            else {
                //If I don't find any other max element, use max element which we already have
                selection(nums, iteration, index+1, max);
            }
        }

        //Now, iteration == index, that means, particular iteration is complete
        //So, whatever max element I found in these particular iteration/pass
        //Swap that max element with the last position's element, of the current search space
        else {
            int temp = nums[max];
            nums[max] = nums[iteration-1];
            nums[iteration-1] = temp;

            //Then, simply just go for the next iteration
            selection(nums, iteration-1, 0, 0);
        }
    }
}
