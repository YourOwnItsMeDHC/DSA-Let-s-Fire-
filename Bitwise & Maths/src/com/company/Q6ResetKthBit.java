//Question :
//If kth bit is 1, then make it 0
//If kth bit is 0, then also make it 0
//https://www.geeksforgeeks.org/program-to-clear-k-th-bit-of-a-number-n/

/*
Whenever we do & of any number with 0 we get 0 only
1 & 0 ==> 0
0 & 1 ==> 0

So, do "k th bit & 0", so k th bit will become 0

Whenever we do & of any number with  we get that same number itself.
1 & 1 ==> 1
0 & 1 ==> 0

Here, we only have to reset Kth bit
So, do & with 0 only for Kth bit
And for rest of the bit, do & with 1

        k=5
         ⬇
Eg : 1 0 1 0 1 1 0
   & 1 1 0 1 1 1 1           <== Doing & with these "mask"
   = 1 0 0 0 1 1 0


     How do we get that mask ?

                      ⬇
        0 0 0 0 0 0 0 1             1
        8 7 6 5 4 3 2 1

        So, now 1 << k-1 , will be

              ⬇
        0 0 0 1 0 0 0 0             1<<k-1 i.e. 3        ---(1)
        8 7 6 5 4 3 2 1

     Take the complement of eqn(1)

     00010000 ==> 11101111

     For complement do XOR(^) or negate it
     Negate is the simpler option ==> ~(00010000) ==> 11101111

     XOR rules :
If n ^ 1 = opposite of n (n's compliment)           ===> 101001 ^ 111111 = 010110
If n ^ 0 = same as of n                             ===> 101001 ^ 000000 = 101001
 */

package com.company;
public class Q6ResetKthBit {
    public static void main(String[] args) {
        int n = 5;
        int k = 1;

        int ans = n & (~(1<<(k-1)));
        System.out.println(ans);
    }
}
