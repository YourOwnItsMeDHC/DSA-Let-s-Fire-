//Print all the indices wherever the target element is present i.e. multiple occurences
package com.company;
import java.util.ArrayList;
public class d3MultipleOccurencesLinearSearch {
    public static void main(String[] args) {

        //Below 4 is repeated thrice i.e. 3 occurences
        int[] nums = {5, 8, 1, 18, 2, 20, 4, 4, 6, 3, 4, 7};
        int target = 4;

        //Method-01
        allOccur(nums, target, 0);
        System.out.println(list);                   //[6, 7, 10]

        //Method-02
        ArrayList<Integer> ans = multiOccur(nums, target, 0, new ArrayList<>());
        System.out.println(ans);                    //[6, 7, 10]

//        System.out.println(multiOccur(nums, target, 0, new ArrayList<>()));

        //Method-03
        System.out.println(alloccur(nums, target, 0));         //[6, 7, 10]
    }




    //Method-01 : Storing position of occurences in an array list, which is outside the function
    //That array list is used inside the function, because of the use of "static
    static ArrayList<Integer> list = new ArrayList<>();
    static void allOccur(int[] nums, int target, int index) {
        if(index == nums.length) {
            return;
        }
        if(nums[index] == target) {
            list.add(index);
        }
        allOccur(nums, target, index+1);
    }







 //Optimized Approach :
    //Method-02 : Using array list in the function i.e. as an argument
//    ArrayList<Integer> list2 = new ArrayList<>();
//    static ArrayList<Integer> multiOccur(int[] nums, int target, int index, ArrayList<Integer> list2) {

    static ArrayList<Integer> multiOccur(int[] nums, int target, int index, ArrayList<Integer> list2) {
        if(index == nums.length) { //Traversing of whole array is done, now just return the array list
            return list2;
        }
        if(nums[index] == target) {
            list2.add(index);
        }

        return multiOccur(nums, target, index+1, list2);
       }

/*
In each function call, new list is not getting created, the same list is getting modified.
i.e. in each function call, list are the reference variable that are pointing to the same arraylist(object) which
was created in the argument.
concept - Call by value of the reference
 */







//Method-03 : Using array list inside the function
    static ArrayList<Integer> alloccur(int[] nums, int target, int index) {
        ArrayList<Integer> list3 = new ArrayList<>();

        if(index == nums.length) {
            return list3;
        }
        if(nums[index] == target) {
            list3.add(index);
        }

        ArrayList<Integer> ansFromNextCalls = alloccur(nums, target, index+1);

        list3.addAll(ansFromNextCalls);

        return list3;
    }

    /*
    list3.addAll(ansFromNextCalls) ====> Whatever elemsnts ansFromNextCalls is having, add that in list3
     */

}






