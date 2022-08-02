/*
Square Star Pattern :

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

[At "i"th row, there is "n" number of columns, i.e. number of columns in a particular "i"th row is "n"]
 */

package com.company;
public class Pattern1 {
    public static void main(String[] args) {
        pattern1(5);
    }

    static void pattern1(int n) {
        for(int row=1; row<=n; row++) {            //outer loop for number of rows(n)
            //[At "i"th row, there is "n" number of columns, i.e. number of columns in a particular "i"th row is "n"]
            for(int col=1; col<=n; col++) {      //  inner loop for columns
                System.out.print("* ");
            }
            System.out.println();                  // ending line after each row
        }
    }

}
