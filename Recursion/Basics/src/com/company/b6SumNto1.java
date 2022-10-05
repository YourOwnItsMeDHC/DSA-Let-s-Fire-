//Similar to previous question ==> Recursion ==> Basic ==> b5
//Print sum of numbers, from N to 1

package com.company;
public class b6SumNto1 {
    public static void main(String[] args) {
        int ans = sum(5);
        System.out.println(ans);
    }

    static int sum(int n) {
        if(n <= 1) {
            return n;
        }

        return n + sum(n-1);
    }
}
