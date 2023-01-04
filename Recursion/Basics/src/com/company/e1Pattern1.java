//Iterative Code :
// https://github.com/YourOwnItsMeDHC/DSA-Let-s-Fire-/blob/master/Patterns/src/com/company/Pattern3.java

//Page = 35
package com.company;
public class e1Pattern1 {
    public static void main(String[] args) {
        star(5, 0);
    }

    static void star(int row, int col) {
        if(row == 0) {                  //There is no more more rows to be getting printed
            return;
        }

        //Whatever number of stars I wanted to print in a particular row, I haven't printed that yet,
        //Now I will go for next column to print a star
        if(col < row) {
            System.out.print('*');
            star(row, col+1);
        }

        //Whatever number of stars I wanted to print in a particular row, I have printed that,
        //Now I will go for next row
        else {
            System.out.println();
            star(row-1, 0);
        }
    }
}

/*
Output :

 *****
 ****
 ***
 **
 *

 */
