package com.company;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

//        int[] nums = {};

//        int[] nums = {1};

//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};           //Best Case : Array already sorted : O(n)

//        //Worst Case : Array sorted in opposite/descending order, so for each element there will be (max)"n"
//        //comparison : O(n^2)
//        int[] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int[] nums = {5, 8, 54, 0, 5, 2, 123, 3};
        System.out.println("Unsorted Array : " + Arrays.toString(nums));
        insertionSort(nums);
        System.out.println("Sorted Array : " + Arrays.toString(nums));

    }


    static void insertionSort(int[] nums) {

        //"i" is counter or pass/iteration counter
        //Here, j=i+1, so, if i<nums.length, then there will be index out o bound for "j"
        //Eg: nums.length=10, i=10th position(index 9), then j=i+1 = 9+1 = 10(index-doesn't exist) ==> index out of bound
        for(int i=0; i<nums.length-1; i++) {                         //or i<=nums.length-2

            //"j" will start comparing from right side and then come towards left, but it should stop comparing when "j==0"
            //Eg : j=1, here, j will compare with index 0
            //But, if j=0, then to whom it will compare ? = "-1", no "-1" doesn't exist
            //So, termination condition for "j" will be "j>0"
            for(int j=i+1; j>0; j--) {

                //If current elemnt is 5(at j) and previous element is 10(at j-1), then it should get swap (ascending order sorting)
                if(nums[j] < nums[j-1]) {
                    swap(nums, j, j-1);
                }
                else {

                    //If current elemnt is 10(at j) and previous element is 5(at j-1), then it's obvious that previous(LHS) elements will be
                    // lesser/smaller only, so there is no need to check further , here just "break" the loop and go for next pass/iteration
                    break;
                }
            }
        }
    }


    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }


}
