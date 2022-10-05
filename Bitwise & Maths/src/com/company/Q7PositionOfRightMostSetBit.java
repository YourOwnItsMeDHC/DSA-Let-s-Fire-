//https://www.geeksforgeeks.org/position-of-rightmost-set-bit/


//Position of rightmost set bit using Left Shift(<<) :
package com.company;
public class Q7PositionOfRightMostSetBit {
    public static void main(String[] args) {
        int n = 18;
        int INT_SIZE =32;

        int position = 1;
        for(int i=0; i<INT_SIZE; i++) {
            if((n & (1<<i)) == 0) {
                position++;
            }
            else {
                System.out.println(position);
                break;
            }
        }
    }
}
