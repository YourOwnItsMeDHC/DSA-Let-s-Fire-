package com.company;
public class b7SumOfDigits {
    public static void main(String[] args) {
        int ans = sumOfDigits(1239);
        System.out.println(ans);
    }

    static int sumOfDigits(int n) {
        if(n == 0) {
            return 0;
        }
        return (n%10) + sumOfDigits(n/10);
    }
}