package com.functions;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Check whether the number entered is Armstrong or not

        System.out.print("Enter the Number : ");
        int num = in.nextInt();

        arm(num);
    }
    static void arm(int n){
        int temp, temp2, rem, count = 0, armstrong = 0;
        temp = temp2 = n;

        while(temp>0){
            rem = temp % 10;
            count += 1;
            temp /= 10;
        }

        // while (num != 0){
        while(n>0){
            rem = n % 10;
            n/= 10;
            armstrong += (int)(Math.pow(rem , count));
        }

        if( temp2 == armstrong){
            System.out.print(temp2 +  " is Armstrong");
        }
        else{
            System.out.print(temp2 + " is not a Armsrtrong");
        }
    }
}
