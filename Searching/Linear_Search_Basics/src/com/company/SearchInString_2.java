package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInString_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Any Word : ");
        String word = in.next().trim();

        System.out.print("Enter Letter, Which You Wanna Find : ");
        char target = in.next().trim().charAt(0);

        System.out.print("Word in Array Form : ");
        System.out.println(Arrays.toString(word.toCharArray()));

        System.out.println(search(word, target));

    }

    static boolean search(String word, char target) {
        if(word.length() == 0) {
            return false;
        }

        for (int i = 0; i <word.length(); i++) {
           if(word.charAt(i) == target) {
               return true;
           }
        }
        return false;
    }
}
