package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValueOfArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Print the Element with Maximum Value of an Array

        int[] arr = new int[5];

        System.out.print("Enter 5 values for an Array : ");

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Array is : " + Arrays.toString(arr));   //Print Array

        maxValue(arr);                                              //Function/Method Call
    }

    static void maxValue(int[] array){
        int max = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Max Value of Element in Array is " + max);
    }
}
