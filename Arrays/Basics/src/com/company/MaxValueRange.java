package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValueRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Max Value of An Array within the range of indices provided

        int[] array = new int[10];

        System.out.print("Enter 10 values for an Array : ");

        for(int i=0; i<array.length; i++) {
            array[i] = in.nextInt();
        }

            System.out.println("Array is : " + Arrays.toString(array));

            System.out.print("Starting index of Range : ");
            int initial = in.nextInt();

            System.out.print("Last index of Range : ");
            int last = in.nextInt();

            System.out.println("Max Value is " + maxRange(array, initial, last));
    }

    static int maxRange(int[] arr, int start, int end){
        if(end < start){
            return -1;                                     //Edge Case
        }

        int max = arr[start];
        for(int i=start; i<=end; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
