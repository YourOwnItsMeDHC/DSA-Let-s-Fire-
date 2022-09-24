//136. Single Number (Easy)
//https://leetcode.com/problems/single-number/

//Question :
//In an array, only one element is there which is not repeating and rest of the elements are repeating twice
//Find that one element which is not repeating

/*
XOR rules :
If n ^ 1 = opposite of n (n's compliment)           ===> 101001 ^ 111111 = 010110
If n ^ 0 = same as of n                             ===> 101001 ^ 000000 = 101001

The ^ is a bitwise XOR operator. It works like this:
00010 ^ 00010 = 00000;
00000 ^ 10101 = 10101;
In other words, if two integers of the same value (and bit representation) are XORed together,
the expression evaluates to all 0s. If a number is XORed with all 0s, the expression evaluates to the number itself. These are both properties of the XOR function.
XORing the entire array together will eliminate all the duplicates (they will all be set to 0) and leave only the single number.
 */
package com.company;
public class Q2NonRepeatingNumber {
    public static void main(String[] args) {
        int[] nums = {2, 4, 3, 5, 3, 2, 4};
        System.out.println(uniqueElm(nums));

        //If same number gets XOR, we get 0              ===> 00010 ^ 00010 = 00000
        //So, XOR all elements, so during the process of XORing, duplicates will become 0, and at the last we will
        //left with unique number i.e. 5
    }

    private static int uniqueElm(int[] nums) {
        int unique = 0;

        for(int n : nums) {
            unique ^= n;
            //XOR(^) the numbers, at the last we will get that particular unique number
        }

        return unique;
    }

}
