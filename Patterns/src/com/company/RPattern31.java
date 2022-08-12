/* /////////////////////////////////////////////////////////////////////////////////////////////////////////////
Square Pattern (Numbers) (Min-Max Distance) :
////////////////////////////////////////////////////////////////////////////////////////////////////////////////// */


package com.company;
public class RPattern31 {
    public static void main(String[] args) {
        pattern31a(4);

        System.out.println();
        pattern31b(4);

        System.out.println();
        pattern31c(4);

        System.out.println();
        pattern31d(4);
    }

    static void pattern31a(int n) {
        n = 2*n;
        for(int row=0; row<=n; row++) {
            for(int col=0; col<=n; col++) {
                int value = 0;
                int leftDist = col;
                int rightDist = n-col;
                int upDist = row;
                int downDist = n-row;

                value = Math.min((Math.min((Math.min(leftDist, rightDist)), upDist)), downDist);

                //Put the minimum distance from all four sides as a value for a particular cell ;
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    /* Output :
       0 0 0 0 0 0 0 0 0
       0 1 1 1 1 1 1 1 0
       0 1 2 2 2 2 2 1 0
       0 1 2 3 3 3 2 1 0
       0 1 2 3 4 3 2 1 0
       0 1 2 3 3 3 2 1 0
       0 1 2 2 2 2 2 1 0
       0 1 1 1 1 1 1 1 0
       0 0 0 0 0 0 0 0 0
     */









    static void pattern31b(int n) {
        n = 2*n;
        for(int row=0; row<=n; row++) {
            for(int col=0; col<=n; col++) {
                int value = 0;
                int leftDist = col;
                int rightDist = n-col;
                int upDist = row;
                int downDist = n-row;

                value = Math.max((Math.max((Math.max(leftDist, rightDist)), upDist)), downDist);

                //Put the maximum distance from all four sides as a value for a particular cell ;
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    /* Output :
       8 8 8 8 8 8 8 8 8
       8 7 7 7 7 7 7 7 8
       8 7 6 6 6 6 6 7 8
       8 7 6 5 5 5 6 7 8
       8 7 6 5 4 5 6 7 8
       8 7 6 5 5 5 6 7 8
       8 7 6 6 6 6 6 7 8
       8 7 7 7 7 7 7 7 8
       8 8 8 8 8 8 8 8 8
     */









    static void pattern31c(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int value = 0;
                int leftDist = col;
                int rightDist = n - col;
                int upDist = row;
                int downDist = n - row;

                value = originalN - Math.min((Math.min((Math.min(leftDist, rightDist)), upDist)), downDist);

                //Put the minimum distance from all four sides as a value for a particular cell ;
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    /* Output :
       4 4 4 4 4 4 4 4 4
       4 3 3 3 3 3 3 3 4
       4 3 2 2 2 2 2 3 4
       4 3 2 1 1 1 2 3 4
       4 3 2 1 0 1 2 3 4
       4 3 2 1 1 1 2 3 4
       4 3 2 2 2 2 2 3 4
       4 3 3 3 3 3 3 3 4
       4 4 4 4 4 4 4 4 4
     */






        //Same as "pattern31c", just change "n = 2 * n;" to "n = 2 * n - 1;", to remove that center "0" (See above output)
        static void pattern31d(int n) {
            int originalN = n;
            n = 2 * n - 1;
            for (int row = 0; row <= n; row++) {
                for (int col = 0; col <= n; col++) {
                    int value = 0;
                    int leftDist = col;
                    int rightDist = n - col;
                    int upDist = row;
                    int downDist = n - row;

                    value = originalN - Math.min((Math.min((Math.min(leftDist, rightDist)), upDist)), downDist);

                    //Put the minimum distance from all four sides as a value for a particular cell ;
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
    /* Output :
       4 4 4 4 4 4 4 4
       4 3 3 3 3 3 3 4
       4 3 2 2 2 2 3 4
       4 3 2 1 1 2 3 4
       4 3 2 1 1 2 3 4
       4 3 2 2 2 2 3 4
       4 3 3 3 3 3 3 4
       4 4 4 4 4 4 4 4
     */

    }
