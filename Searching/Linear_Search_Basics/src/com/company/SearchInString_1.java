package com.company;

import java.util.Scanner;

public class SearchInString_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter A String : ");
        String str = in.next().trim();

        System.out.print("Character You Wanna Search : ");
        char letter = in.next().trim().charAt(0);

        int length = str.length();

        int position = -1;
        for (int i = 0; i <length-1 ; i++) {
            if(letter == str.charAt(i)) {
                position = i+1;                      //i+1 because, we will count position from 1
                System.out.println(letter + " is present at position : " + position + " in " + str);
//                break;
                //If break is uncommented it will return all occurrences of letter
                //If break is commented it will return only the first occurrence of letter
            }
        }
        if(position == -1) {
            System.out.println(letter + " is not present in " + str);
        }
    }
}
