package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        //Swap the Element of index provided by user

        int[] arr = new int[5];

        System.out.println("Enter 5 values for Array : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Enter Two Index Value : ");
        int in1 = in.nextInt();
        int in2 = in.nextInt();

        swap(arr, in1, in2);

        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
