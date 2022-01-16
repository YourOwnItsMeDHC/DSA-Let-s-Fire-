package com.functions;

import java.util.Scanner;

public class ArmstrongBoolean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Check whether the number entered is Armstrong or not using Boolean as a data type

        System.out.print("Enter the Number : ");
        int num = in.nextInt();

        System.out.println(arm(num));

        /* line 14 and line 16 to line 19 means the same
        boolean ans = arm(num);
        System.out.println(ans);
         */
    }

    static Boolean arm(int n){
        int temp, temp2, rem, count = 0, armstrong = 0;
        temp = temp2 = n;

        while(temp>0){
            rem = temp % 10;
            count += 1;
            temp /= 10;
        }

        while(n>0){
            rem = n % 10;
            n/= 10;
            armstrong += (int)(Math.pow(rem , count));
        }

        return armstrong == temp2;

        /*line 33 and line 35 to line 42 means the same
        if(armstrong == temp2){
             return true;
          }
          else{
               return false;
            }
         */

    }
}
