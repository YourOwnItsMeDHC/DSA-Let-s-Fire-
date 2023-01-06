//Iterative Bubble Sort :
// https://github.com/YourOwnItsMeDHC/DSA-Let-s-Fire-/blob/master/Sorting/Bubble%20Sort/Basics/src/com/company/BubbleSort.java

//Pg-37 : Recursion Tree
//The code is so much similar or I can say little bit modification of recursive downward triangle
// https://github.com/YourOwnItsMeDHC/DSA-Let-s-Fire-/blob/master/Recursion/Basics/src/com/company/e1Pattern1.java
package com.company;
import java.util.Arrays;
public class e3BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        bubble(nums, nums.length-1, 0);
        System.out.println(Arrays.toString(nums));           //[1, 2, 3, 4, 5]
    }

    //Pg-37 : Recursion Tree
    static void bubble(int[] nums, int iteration, int index) {
        if(iteration == 0) {
            return;
        }

        //Current index should always be smaller than iteration.
        //Because, here iteration value is denoting search space for each respective pass or iteration
        if(index < iteration) {

            //If element at current index is greater than the element which is at next index ==> Just swap it
            //So, et the end of each iteration/pass, greter element of the current search space would get
            //place at the last position i.e. at the position, where it has to be
            if(nums[index] > nums[index+1]) {
                int temp = nums[index];
                nums[index] = nums[index+1];
                nums[index+1] = temp;
            }

            //After swapping go for next index
            bubble(nums, iteration, index+1);
        }
        else {
            bubble(nums, iteration-1, 0);
        }
    }
}
