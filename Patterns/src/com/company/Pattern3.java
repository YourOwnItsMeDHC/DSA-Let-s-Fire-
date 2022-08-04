/*
Downward Triangle Star Pattern :

n=5

* * * * *      row=n     = 5 ,   col = 5 = n = row
* * * *        row=n-1   = 4 ,   col = 5-1 = 4 = n-1 = row
* * *          row=n-2   = 3 ,   col = 5-2 = 3 = n-2 = row
* *            row=n-3   = 2 ,   col = 5-3 = 2 = n-3 = row
*              row=n-4   = 1 ,   col = 5-4 = 1 = n-4 = row

[At "i"th row, there is "n" number of columns, i.e. number of columns in a particular "i"th row is "n"]
 */

package com.company;
public class Pattern3 {
    public static void main(String[] args) {
        pattern3(5);
    }

    static void pattern3(int n) {
//        for(int row=n; row>=1; row--) {         //outer loop for number of rows(n)
//            for(int col=1; col<=row; col++) {   //  inner loop for columns
        for(int row=1; row<=n; row++) {
            for(int col=1; col<=n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();               // ending line after each row
        }
    }

}
