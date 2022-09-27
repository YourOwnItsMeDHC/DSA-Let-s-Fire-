//https://www.geeksforgeeks.org/find-value-k-th-bit-binary-representation/

/*
Approach 1:
1) Find a number with all 0s except k-th position. We get this number using ( 1 << (k-1) ). For example if k = 3, then ( 1 << 2) gives us (00..00100).
2) Do bitwise and of above-obtained number with n to find if k-th bit in n is set or not.
 */

package com.company;
public class Q4KthBitOfNumber {
    public static void main(String[] args) {

        int n = 37;            //100101
        int k = 5;

        System.out.println(n & (1  << (k-1) >> (k-1)));
    }
}

//    Time Complexity: O(1), the code will run in a constant time.
//    Auxiliary Space: O(1), no extra space is required, so it is a constant.
























/*
Approach 2:
1) Right shift the number (k-1) times, so that the kth bit comes at the right (Least Significant Bit).
We can do this by n >> (k-1). For example for number 37(100101) and k = 3, ( 32 >> (3-1) ) will be equal to 9(1001).

2) Then just check the last bit is set or not. We can easily do this by checking if number is odd or even.


package com.company;
public class Q4KthBitOfNumber {
    public static void main(String[] args) {

        int n = 37;            //100101
        int k = 3;

        System.out.println((n >> (k-1)) % 2);
//        System.out.println((n >> (k-1)) & 1);         //Q1 Even Odd ==> gives last bit

    }
}



Time Complexity: O(1), the code will run in a constant time.
Auxiliary Space: O(1), no extra space is required, so it is a constant.
 */


