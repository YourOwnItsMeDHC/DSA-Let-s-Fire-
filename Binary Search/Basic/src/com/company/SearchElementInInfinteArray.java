package com.company;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
import java.util.Scanner;

public class SearchElementInInfinteArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
        As an array is of infinite size, take small small chunks of that array and
        check whether target lies in that chunk or not.
        If target lies in that chunk, then just apply Binary Search in that chunk and find the target.
        If target lies in that chunk, then move ahead to next chunk and again check whether target lies in that chunk or not.

        Initially, we take window size as 2, and then we will increase it window size exponentially i.e 2^n
         */

        //Assume below array as infinite
        int[] nums = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};

        System.out.println("Enter Target Value : ");
        int target = in.nextInt();

        System.out.println(ans(nums, target));
    }

    //Method which finds chunks, and if target comes under chunk, it calls another method "binarySearch" for finding index of target:
    static int ans(int[] nums, int target) {
        //Firstly, start checking for target in the window/box of size = 2
        int start = 0;
        int end = 1;

        while(target > nums[end]) {    //It means target is not under these chunk, check for another chunk
            //Now, double the size of window
            int newStart = end + 1;

            //end = OldEnd + (SizeOfBox * 2)
            end = end + (end - start +1) * 2;
            start = newStart;
        }
        //Now, it's out of "while" loop means target < nums[end], just do Binary Search in that chunk, and find index of target
        return binarySearch(nums, target, start, end);
    }

    //Method of Binary Search : (Apply only for that chunk which found in "ans" method, so pass start and end of that chunk only
    static int binarySearch(int[] nums, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end-start)/2;

            if(target < nums[mid]) {
                end = mid -1;
            }
            else if(target > nums[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

}
