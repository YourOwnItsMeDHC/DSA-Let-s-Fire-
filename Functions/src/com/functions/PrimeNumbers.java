package com.functions;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Check whether the number is Prime or not

        System.out.print("Enter the Number : ");
        int num = in.nextInt();

        System.out.println(isPrime(num));

//        //line 14 or line 16 to 1ine 18
//        boolean ans = isPrime(num);
//        System.out.println(ans);
    }

        static boolean isPrime(int num){
            if(num<=1){
                return false;
            }
            int c = 2;

            while(c*c < num){
                if(num % c == 0){
                    return false;
                }
                else{
                    c += 1;
                }
            }
            if(c*c > num){
                return true;
            }
            else{
                return false;
            }

//            //line 35 to line 40 or line 42 to line 43
//            return c*c > num;
        }
}
