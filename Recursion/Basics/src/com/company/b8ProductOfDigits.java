package com.company;

public class b8ProductOfDigits {
    public static void main(String[] args) {
        int ans = productOfDigits(5253);
        System.out.println(ans);
    }

    static int productOfDigits(int n) {
        if(n%10 == n) {                    //i.e. we have reached , base condition , multiplied by 1 itself
            return n;
        }
        return (n%10) * productOfDigits(n/10);
    }
}
