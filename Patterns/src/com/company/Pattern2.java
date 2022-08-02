/*
Right Triangle Star Pattern :

*
* *
* * *
* * * *
* * * * *

[At "i"th row, there is "i" number of columns, i.e. number of columns in a particular "i"th row is "i"
 */

package com.company;
public class Pattern2 {
    public static void main(String[] args) {
        rightTriangleStarPattern(5);
    }

    static void rightTriangleStarPattern(int n) {
        for(int row=1; row<=n; row++) {            //outer loop for number of rows(n)
            for(int col=1; col<=row; col++) {      //  inner loop for columns
                System.out.print("* ");
            }
            System.out.println();                  // ending line after each row
        }
    }

}
