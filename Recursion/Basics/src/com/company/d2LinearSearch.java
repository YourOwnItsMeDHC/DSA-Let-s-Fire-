package com.company;

public class d2LinearSearch {
    public static void main(String[] args) {
        int[] nums = {5, 4, 8, 10, 3, 2, 19, 7, 20};
        int target = 10;
        System.out.println(linearSearch(nums, target, 0));    //3
        System.out.println(linearSearchBack(nums, target, nums.length-1));    //3
        System.out.println(elementExists(nums, target, 0));
    }

    //Method - 01 =====> Find index of an element
    static int linearSearch(int[] nums, int target, int index) {
        if(index == nums.length) {
            return -1;
        }
        if(nums[index] == target) {
            return index;
        }
        return linearSearch(nums, target, index+1);
    }





    //Method - 02 =====> Find index of an element from back i.e. last index to zeroth index
    static int linearSearchBack(int[] nums, int target, int index) {
        if(index == -1) {
            return -1;
        }
        if(nums[index] == target) {
            return index;
        }
        return linearSearchBack(nums, target, index-1);
    }






    //Method - 03 =====> Whether element exists in an array or not
    static boolean elementExists(int[] nums, int target, int index) {
        if(index == nums.length) {
            return false;
        }

        return nums[index]==target || elementExists(nums, target, index+1);
    }
}

/*
nums[index]==target   ====> If element found, or whether our target is there in the remaining portion
of the array i.e. elementExists(nums, target, index+1)
 */
