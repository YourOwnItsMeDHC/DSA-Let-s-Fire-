package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValueRangeInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Input is already provided

        int[] array = {10, 11, 12, 13, 14, 15};

        System.out.println("Array is : " + Arrays.toString(array));

        System.out.print("Starting index of Range : ");
        int initial = in.nextInt();

        System.out.print("Last index of Range : ");
        int last = in.nextInt();

        System.out.println("Max Value is " + maxRange(array, initial, last));
    }

    static int maxRange(int[] arr, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        if(end < start){
            return -1;
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
