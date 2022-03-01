package com.company;

import java.util.Scanner;

public class SearchElement {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Size of Array : ");
        int n = in.nextInt();

        int[] nums = new int[n];

        for(int i=0; i<nums.length; i++) {
            System.out.print("Enter Element For Index " + i + ": ");
            nums[i] = in.nextInt();
        }

        System.out.print("Which Element You Would Like To Search : ");
        int target = in.nextInt();

        System.out.println(linearSearch(nums, target));

        //NoteTo Users
        System.out.println("(If it is returning 2147483647");
        System.out.println(" It simply means Element is not Present or the size of an Array is 0");
        System.out.println("//We returned 2147483648 , because 2147483647 is the Max Int value accepted");
        System.out.println("//So, if Element is not Present or the size of an Array is 0, it will return max value of an integer + 1)");
         }

    static int linearSearch(int[] nums, int target) {
        if(nums.length == 0) {
            return (Integer.MAX_VALUE);
        }

        //Here, we can use "Enhanced for' loop
        for(int element : nums) {
            if(element == target) {
                return element;
            }
        }

        //If after searching in whole Array, Element not found i.e. not present, so just return
        return (Integer.MAX_VALUE);
    }
}
