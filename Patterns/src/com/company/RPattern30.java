/* Same as Pattern-28 : Diamond Shape Pattern (👈👈👈👈Firstly See These)
https://github.com/YourOwnItsMeDHC/DSA-Let-s-Fire-/blob/master/Patterns/src/com/company/RPattern28.java

Diamond Pattern (Numbers) :

        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5

 */


package com.company;
public class RPattern30 {
    public static void main(String[] args) {
        pattern30(5);
    }

    static void pattern30(int n) {
        for(int row=1; row<=n; row++) {

            int spaces = n-row;
            for(int s=1; s<=spaces; s++) {
                System.out.print("  ");
            }

            for(int col=row; col>=1; col--) {
                System.out.print(col + " ");
            }

            for(int col=2; col<=row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

}
