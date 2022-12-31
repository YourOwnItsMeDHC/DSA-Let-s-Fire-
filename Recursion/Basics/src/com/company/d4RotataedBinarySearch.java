//Search an element in a rotated sorted array
//Without Recursion :  BS ==> Basics => 10. 33. Search in Rotated Sorted Array👍👍(BS-Medium)
// https://github.com/YourOwnItsMeDHC/DSA-Let-s-Fire-/blob/master/Binary%20Search/Basic/src/com/company/33.%20Search%20in%20Rotated%20Sorted%20Array

package com.company;
public class d4RotataedBinarySearch {
    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 8, 9, 1, 2, 3};
        int target = 2;

        System.out.println(rbs(nums, target, 0, nums.length-1));      //6
        System.out.println(nouse(nums, target, 0, nums.length-1));    //6
    }

    static int rbs(int[] nums, int target, int start, int end) {
        if(start > end) {
            return -1;
        }

        int mid = start + (end-start) / 2;
        if(nums[mid] == target) {
            return mid;
        }

        if(nums[start] <= nums[mid]) {    //It means, first half is sorted

            //If now, first half is sorted, start will be smallest in that first array half, end(mid in these case)
            //will be the largest in that first array half
            //If our target value lies between the values of start and end(mid in these case)
            //Then apply "rbs", in these half of the rray on;ly, recursively
            if(target >= nums[start] && target <= nums[mid]) {
                return rbs(nums, target, start, mid-1);
            }
        }

        //If not the above case, target might present outside the half(which we were considering in the above case)
        return rbs(nums, target, mid+1, end);
    }












    //Same code as above, not thinking that, it is of much use
    //Prefer above code only, simple, direct, and it is executable as well
    static int nouse(int[] nums, int target, int start, int end) {
        if(start > end) {
            return -1;
        }

        int mid = start + (end-start) / 2;
        if(target == nums[mid]) {
            return mid;
        }

        if(nums[start] <= nums[mid]) {
            if(target >= nums[start] && target <= nums[mid]) {
                return nouse(nums, target, start, mid-1);
            }
            else {
                return nouse(nums, target, mid+1, end);
            }
        }

        if(target >= nums[mid] && target <= nums[end]) {
            return nouse(nums, target, mid+1, end);
        }

        return nouse(nums, target, start, mid-1);
    }

}
