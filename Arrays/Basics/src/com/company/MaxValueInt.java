package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValueInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Return Type of Method is Int

        int[] arr = new int[5];

        System.out.print("Enter 5 values for an Array : ");

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Array is : " + Arrays.toString(arr));   //Print Array

        System.out.println(maxValue(arr));
    }

    static int maxValue(int[] array){
        int max = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
       return max;
    }
}
