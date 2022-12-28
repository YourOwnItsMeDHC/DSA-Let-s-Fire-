//For Recusrsion Tree : See Page == 32
package com.company;
public class d1SortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(isSorted(nums));
    }

    static boolean isSorted(int[] nums) {
        return helper(nums, 0);
    }

    static boolean helper(int[] nums, int current) {
        if(current == nums.length-1) {
            return true;
        }
        //Above, condition is because, eg : current=10, there is no element for comparison i.e. current+1=???
        //Hence, it is used to eliminate index out of bound error

        return nums[current] < nums[current+1] && helper(nums, current+1);

    }

}
