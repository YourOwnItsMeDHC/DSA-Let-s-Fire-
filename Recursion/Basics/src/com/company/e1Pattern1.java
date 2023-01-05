//Iterative Code :
// https://github.com/YourOwnItsMeDHC/DSA-Let-s-Fire-/blob/master/Patterns/src/com/company/Pattern3.java

//Earlier, in iterative approach, we were using two for loops. One for iterating rows, one for iterating columns
//Hence, here we are using two arguments for rows and columns instead of two for loops.

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
