//Refer : https://www.geeksforgeeks.org/cycle-sort/

package com.company;
import java.util.Arrays;

public class CycleSort {

    public static void main(String[] args) {

//        int[] nums = {};

//        int[] nums = {1};

//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};           //Best Case : Array already sorted : O(n)

//        //Worst Case : Array sorted in opposite/descending order, so for each element there will be (max)"n"
//        //comparison : O(n^2)
//        int[] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

            int[] nums = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5};
            System.out.println("Unsorted Array : " + Arrays.toString(nums));
            cycleSort(nums);
            System.out.println("Sorted Array : " + Arrays.toString(nums));

    }


    static void cycleSort(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correctIndex = nums[i] - 1;

//            if(nums[i] != nums[correctIndex] && nums[i] < nums.length) {
            if(nums[i] != nums[correctIndex]) {
                swap(nums, i, nums[i]-1);
            }
            else {
               i++;
            }
        }
    }


    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}



/*
arr[] = {5, 3, 1, 4, 2}
index =  0  1  2  3  4

i  = 0;
while( i < arr.length)
     correctposition = arr[i]-1;

     find ith item correct postioin
     for the first time i = 0 arr[0] = 5 correct index of 5 is 4 so arr[i] - 1 = 5-1 = 4


     if( arr[i] <= arr.length && arr[i] != arr[correctposition])


         arr[i] = 5 and arr[correctposition] = 4
         so 5 <= 5 && 5 != 4 if condition true
         now swap the 5 with 4


         int temp = arr[i];
         arr[i] = arr[correctposition];
         arr[correctposition] = temp;

         now resultant arr at this after 1st swap
         arr[] = {2, 3, 1, 4, 5} now 5 is shifted at its correct position

         now loop will run again check for i = 0 now arr[i] is = 2
         after swaping 2 at its correct position
         arr[] = {3, 2, 1, 4, 5}

         now loop will run again check for i = 0 now arr[i] is = 3
         after swaping 3 at its correct position
         arr[] = {1, 2, 3, 4, 5}

         now loop will run again check for i = 0 now arr[i] is = 1
         this time  1 is at its correct position so else block will execute and i will increment i = 1;
         once i exceeds the size of array will get array sorted.
         arr[] = {1, 2, 3, 4, 5}


      else

         i++;
loop end;

once while loop end we get sorted array just print it
for( index = 0 ; index < arr.length; index++)
    print(arr[index] + " ")
sorted arr[] = {1, 2, 3, 4, 5}
 */








/*
// java program to check implement cycle sort
import java.util.*;
public class MissingNumber {
	public static void main(String[] args)
	{
		int[] arr = { 3, 2, 4, 5, 1 };
		int n = arr.length;
		System.out.println("Before sort :");
		System.out.println(Arrays.toString(arr));
		CycleSort(arr, n);

	}

	static void CycleSort(int[] arr, int n)
	{
		int i = 0;
		while (i < n) {
			// as array is of 1 based indexing so the
			// correct position or index number of each
			// element is element-1 i.e. 1 will be at 0th
			// index similarly 2 correct index will 1 so
			// on...
			int correctpos = arr[i] - 1;
			if (arr[i] < n && arr[i] != arr[correctpos]) {
				// if array element should be lesser than
				// size and array element should not be at
				// its correct postion then only swap with
				// its correct positioin or index value
				swap(arr, i, correctpos);
			}
			else {
				// if element is at its correct position
				// just increment i and check for remaining
				// array elements
				i++;
			}
		}
			System.out.println("After sort : ");
			System.out.print(Arrays.toString(arr));


	}

	static void swap(int[] arr, int i, int correctpos)
	{
	// swap elements with their correct indexes
		int temp = arr[i];
		arr[i] = arr[correctpos];
		arr[correctpos] = temp;
	}
}
// this code is contributed by devendra solunke

 */
