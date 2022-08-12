/*
Right Pascal’s Triangle :

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
public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
        System.out.println();
        pattern5a(5);

        System.out.println();
        pattern5b(5);

        System.out.println();
        pattern5c(5);
    }



    static void pattern5(int n) {
        for(int row=1; row<=2*n-1; row++) {
            int totalRow = 2*n-1;

            if(row <= n) {
                for(int col=1; col<=row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else {
                for(int col=1; col<=totalRow-row+1; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }



















    //Taking out formula of totalColInParticularRow (Also, indexing starts from "1") :
    static void pattern5b(int n) {
        for(int row=1; row<=2*n-1; row++) {
            int totalColInParticularRow = row>n ? 2*n-row : row;
            for(int col=1; col<=totalColInParticularRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }












//Taking out formula of totalColInParticularRow (Also, indexing starts from "0") :
    static void pattern5c(int n) {
        for(int row=0; row<2*n; row++) {
            int totalColumnInParticularRow = row>n ? 2*n-row : row;
            for(int col=0; col<totalColumnInParticularRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


















//    Brute Force - Combining Pattern 2 and Pattern 3 :
    static void pattern5a(int n) {
        for(int row=1; row<=n; row++) {
            for(int col=1; col<=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=1; row<=n-1; row++) {
            for(int col=1; col<n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
