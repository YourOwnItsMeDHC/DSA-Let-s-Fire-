package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ModifyUsingMethods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Modify element of an Array using Functions or Methods  (Arrays are mutable)

        int[] num = {10, 20, 30, 40, 50};

        System.out.print("Before Modification : ");
        System.out.println(Arrays.toString(num));
        System.out.println();                         //line spacing

        modifyInteger(num);                           //It will change the value/object , because Array is Mutable
        System.out.print("After Modification : ");
        System.out.println(Arrays.toString(num));     //40 is changed to 145 will get print
    }

    static void modifyInteger(int[] number){
        number[3] = 145;
    }
}
