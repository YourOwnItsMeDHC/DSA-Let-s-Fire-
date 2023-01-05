//Refer Pattern-38 from ⬇
// https://www.javainterviewpoint.com/pattern-programs-in-java/
package com.company;
public class ZPatternFibonacci {
    public static void main(String[] args) {
        int rows = 3;
        int star = -1;

        //Upper Triangle :
        System.out.println("## Printing the pattern ##");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(fibonacci(++star) + " ");
            }
            System.out.println();
        }

        //Lower Triangle :
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= rows - i; k++)
            {
                System.out.print(fibonacci(++star) + " ");
            }
            System.out.println();
        }
    }

    static int fibonacci(int n) {
        if(n < 2) {
            return n;
        }

        //Recursion :
//        return fibonacci(n-1)  + fibonacci(n-2);

        //Golden Ratio :
        return (int)((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }
}
