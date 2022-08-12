/* Same as Pattern-30 : Diamond Shape Pattern (👈👈👈👈Firstly See These)
https://github.com/YourOwnItsMeDHC/DSA-Let-s-Fire-/blob/master/Patterns/src/com/company/RPattern30.java

Diamond Pattern (Numbers) :

        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
  4 3 2 1 2 3 4
    3 2 1 2 3
      2 1 2
        1

 */


package com.company;
public class QPattern17 {
    public static void main(String[] args) {
        pattern17(5);
    }

    static void pattern17(int n) {
        for(int row=1; row<2*n; row++) {
            int totalColInRow = row>n ? 2*n-row : row;          //From Pattern - 17

            int spaces = n-totalColInRow;
            for(int s=1; s<=spaces; s++) {
                System.out.print("  ");
            }

            for(int col=totalColInRow; col>=1; col--) {
                System.out.print(col + " ");
            }

            for(int col=2; col<=totalColInRow; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

}
