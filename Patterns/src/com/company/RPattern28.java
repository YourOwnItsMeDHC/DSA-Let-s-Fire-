/* Same as Pattern-5 : Right Pascal’s Triangle (👈👈👈👈Firstly See These)
https://github.com/YourOwnItsMeDHC/DSA-Let-s-Fire-/blob/master/Patterns/src/com/company/Pattern5.java

Diamond Shape Pattern :

    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

 */


package com.company;
public class RPattern28 {
    public static void main(String[] args) {
        pattern28(5);
    }

    static void pattern28(int n) {
        for(int row=1; row<2*n; row++) {
            int totalColInRow = row>n ? 2*n-row : row;

            //Number Of Spaces :
            int spaces = n-totalColInRow;
            for(int s=1; s<=spaces; s++) {
                System.out.print(" ");
            }

            for(int col=1; col<=totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
