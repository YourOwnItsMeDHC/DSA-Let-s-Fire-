package com.company;
public class a3PrintNumbersUsingRecursion {
    public static void main(String[] args) {
        //WAP which takes input as a number that upto what number it should print
        //Print first 5 numbers : 1, 2, 3, 4, 5

        numbers(1);
    }

    static void numbers(int n) {
        //Base condition, where recursion of function has to be stop :
        if(n > 5) {
            return;
        }
        System.out.println(n);
        numbers(n+1);
    }

}
