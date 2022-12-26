//Count Number Of Zeroes
package com.company;
public class c2CountZero {
    public static void main(String[] args) {
        System.out.println(count(2030405));
    }

    static int count(int n) {
        //Here, we have created extra "helper" function, because we need an extra argument for "count'
        return helper(n, 0);
    }

    static int helper(int n, int count) {
        if(n == 0) {
            return count;
        }

        int rem = n%10;
        if(rem == 0) {
            return helper(n/10, ++count);
        }
        return helper(n/10, count);

    }

}
