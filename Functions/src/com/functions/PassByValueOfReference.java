package com.functions;

import java.util.Arrays;

public class PassByValueOfReference {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4 ,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] array) {
        array[0] = 10;
    }
}

     //Here element of oth index is changed , because we didn't changed the object , we have just modified it .
     //In java , we don't have pass or call by reference and pointer concept , we have pass or call by value.