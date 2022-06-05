//Q : Find Number Of Rotations
package com.company;

public class RotationCount {
    public static void main(String[] args) {

        //Number of Rotation Count = Pivot position + 1

//        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};     //0 Rotation
        int[] nums = {60, 70, 80, 90, 100, 10, 20, 30, 40, 50};     //5 Rotations
        System.out.println("Number Of Rotations : " + (findPivot(nums) + 1));
    }

    //Use Below one : if array doesn't contain duplicate elements
    //Method for finding Pivot/Peak/Largest Elements :
    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = start + (end-start)/2;

            //For finding pivot, we have 4 cases here :
            if(mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]) {
                return mid-1;
            }

            if(nums[start] >= nums[mid]) {
                //In rotated sorted BS, all the elements at left of mid are greater
                //than mid, and all the elements at right of mid are smaller than mid
                //Here, mid is smaller than start, and here we have to find largest                   //element, which will never be at right, so search at left
                end = mid-1;
            }
            else {                           //nums[start] < nums[mid]
                //Here mid is greater than start, so check at right
                start = mid+1;
            }
        }
        return -1;
    }




//    //Use Below one : if array contain duplicate elements
//    //Method for finding Pivot/Peak/Largest Elements :
//    static int findPivotWithDuplicates(int[] nums) {
//        int start = 0;
//        int end = nums.length-1;
//        while(start <= end) {
//            int mid = start + (end-start)/2;
//
//            //For finding pivot, we have 4 cases here :
//            if(mid < end && nums[mid] > nums[mid+1]) {                          //Case ; 1
//                return mid;
//            }
//            if(mid > start && nums[mid] < nums[mid-1]) {                        //Case ; 2
//                return mid-1;
//            }
//
//            //If element at mid, start, end are same, then just skip or ignore that , because they are duplictes as same as mid.
//            //Solution : Just move to next element of start and previous element of end.
//            if(nums[start] == nums[mid] && nums[end] == nums[mid]) {
//
//                //But, before ignoring it, just check it, because there may be the case where these elements can be the PIVOT
//                //Check if start is pivot : (Using Case-1)
//                //In case-1, we were checking whether mid is pivot or not, here we are checking whether start is pivot or not, so in place of mid just write start, as it is same like case-1
//                if(nums[start] > nums[start+1]) {
//                    return start;
//                }
//                start++;
//
//                //Check if end is pivot : (Using Case-2)
//                //In case-2, we were checking whether mid-1 is pivot or not, here we are checking whether end-1 is pivot or not, so in place of mid-1 just write end-1, as it is same like case-2
//                if(nums[end-1] > nums[end]) {
//                    return end;
//                }
//                end--;
//            }
//            else if(nums[mid]>nums[start]  || nums[mid] == nums[start] && nums[mid] > nums[end]) {    //Then go to right side
//                /*
//                Either 1 or 2 has to be true, and 3 has definetely be true
//                1: It means pivot will definetely be not at left, so check at right
//                2: It means element in between start and mid will also be same i.e
//                   4, 4, 4, 5, 1,2            start = 0, mid=3 , here between elements is also same, so just check at right
//                3: If mid is greater than end, and here end is the last element, it means pivot is somewhere outside of end of these particular chunk, so check at another chunk i.e. at right side
//                 */
//                start = mid+1;
//            }
//            else {                                                                                    //Then go to left side
//                end = mid-1;
//            }
//        }
//        return -1;
//    }

}
