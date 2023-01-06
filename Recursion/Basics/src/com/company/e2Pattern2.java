//See previous code for method-01
// https://github.com/YourOwnItsMeDHC/DSA-Let-s-Fire-/blob/master/Recursion/Basics/src/com/company/e1Pattern1.java


//Method - 02
package com.company;
public class e2Pattern2 {
    public static void main(String[] args) {
        int n = 5;
        star(1, 1, n);
    }

    static void star(int rows, int cols, int n) {
        if(rows > n) {
            return;
        }

        if(cols <= rows) {
            System.out.print("*");
            star(rows, cols+1, n);
        }
        else {                             //cols > rows
            System.out.println();
            star(rows+1, 1, n);
        }
    }
}
