//Must See these : https://media.geeksforgeeks.org/wp-content/uploads/20220722205737/MergeSortTutorial.png
//Article : https://www.geeksforgeeks.org/merge-sort/
//Have a loon on the Algorithm notes as well

package com.company;
import java.util.Arrays;
public class f1MergeSort {
    public static void main(String[] args) {

        int[] nums = {5, 4, 3, 2, 1};

        //It's creating new object/array, "sort" function is returning new array
        //It's not modifying my "nums" array
        //Recursion is returning new array with all those same elements which are in my "nums" array
        //But in sorted manner
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));              //[5, 4, 3, 2, 1]

        //One way : store returned array in new variable
        int[] ans = mergeSort(nums);
        System.out.println(Arrays.toString(ans));              //[1, 2, 3, 4, 5]

        //Second way : update "nums" array with the updated array
        nums = mergeSort(nums);
        System.out.println(Arrays.toString(nums));             //[1, 2, 3, 4, 5]


        //In-Place
        mergeSortInPlace(nums, 0, nums.length);
        System.out.println(Arrays.toString(nums));             //[1, 2, 3, 4, 5]

    }


    //Merge sort, after merging each sub-part, will return new merged object/array
    static int[] mergeSort(int[] nums) {

        //If I am having only one element, I can't divide it further, so just simply return it
        if(nums.length == 1) {
            return nums;
        }

        //If array is still having more than one element in it, divide that. further into 2 subparts i.e nums/2 ,
        //and apply merge sort on them as well

        //That subpart will be passed as the argument on to that mergeSort function as the same copy of nums,
        //specifying the range to be copied
        int mid = nums.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        /* Arrays.copyOfRange :
        Copies the specified range of the specified array into a new array.
        Params:
           original – the array from which a range is to be copied
           from – the initial index of the range to be copied, inclusive
           to – the final index of the range to be copied, exclusive. (This index may lie outside the array.)
         */

        //We have to merge left and right subpart while sorting it
        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        //Store merged sorted array elements into a new array, which we have to return
        int[] mix = new int[first.length + second.length];

        int i=0; //For first
        int j=0; //For second
        int k=0; //For mix

        while(i<first.length && j<second.length) {
            if(first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            }
            else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        //There might be the case that there is no more elements left in either of the array(i.e. first or second)
        //For comparison, so whatever elements are left, just put that into the mix array
        while(i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }









































    static void mergeSortInPlace(int[] nums, int start, int end) {
        if(end - start == 1) {
            return;
        }

        int mid = start + (end-start) / 2;

        mergeSortInPlace(nums, start, mid);
        mergeSortInPlace(nums, mid, end);

        mergeInPlace(nums, start, mid, end);
    }

    static void mergeInPlace(int[] nums, int start, int mid, int end) {
        int[] mix = new int[end-start];

        int i = start;
        int j = mid;
        int k = 0;

        while(i<mid && j<end) {
            if(nums[i] < nums[j]) {
                mix[k] = nums[i];
                i++;
            }
            else {
                mix[k] = nums[j];
                j++;
            }
            k++;
        }

        while(i < mid) {
            mix[k] = nums[i];
            i++;
            k++;
        }

        while(j < end) {
            mix[k] = nums[j];
            j++;
            k++;
        }

        //Put all the values of "mix" array into the "nums" array, in order to modify "nums" array
        for(int l=0; l<mix.length; l++) {
            nums[start + l] = mix[l];
        }

        //Eg :
        //11 28 13 4 15 60 17
        //         S     E
        //Above we are doing nums[start + l], because "start" at every function call will differ
        //Hence, here I don't have to sort from index 0 in these particular function call, I just have to sort
        //from these "S" to "E" i.e here I only have to sort 4 15 and 60
    }
}






































