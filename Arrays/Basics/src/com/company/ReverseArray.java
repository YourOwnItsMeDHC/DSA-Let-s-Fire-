package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Reverse of an Array  (Two Pointer Approach)

        int[] array = new int[6];                             //Declare and Initialize

        System.out.print("Enter " + array.length + " values for an Array : ");         //Message to Input the Values

        for(int i=0; i<array.length; i++){                   //Take Input
            array[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(array));          //Print Array

        reverse(array);                                      //Calling Reverse Method

        System.out.println("Reversed Array : " + Arrays.toString(array));

    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            swap(arr, start, end);                           //Calls Swap Method
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
