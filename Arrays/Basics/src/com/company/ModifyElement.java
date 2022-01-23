package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ModifyElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Modify the element of an Array

        //Array Of Objects
        String[] word = new String[5];

        System.out.print("Enter " + word.length + " words : ");
        int i;
        for(i=0; i<word.length; i++){
            word[i] = in.next();
        }

        System.out.println(Arrays.toString(word));

        //Modify index 3 by "Deepak"
        word[3] = "Deepak";

        System.out.println("Modified Array is : ");
        System.out.print(Arrays.toString(word));
    }
}
