package com.company;
public class a5BinarySearch {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40,50, 60, 70, 80, 90, 100};
        int target = 80;

        int ans = binarySearch(nums, target, 0, nums.length-1);
        System.out.println(ans);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        if(start > end) {
            return -1;
        }

        int mid = start + (end-start)/2;

        if(nums[mid] == target) {
            return mid;
        }

        if(target < nums[mid]) {
            return binarySearch(nums, target, start, mid-1);
        }
        return binarySearch(nums, target, mid+1, end);
    }
}
