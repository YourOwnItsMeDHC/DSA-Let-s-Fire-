//Must check ===> Q.4 , then check below link
//https://www.geeksforgeeks.org/set-k-th-bit-given-number/

//1 minute video : https://www.youtube.com/watch?v=YypE7aZUa3Y

//Question :
//If kth bit is 0, then make it 1
//If kth bit is 1, then also make it 1

package com.company;
public class Q5SetTheKthBit {
    public static void main(String[] args) {
        int n = 113;
        int k = 4;

        System.out.println(((1 << k) | n));


        /*
        Let n=113 and k=4

        0 1 1 1 0 0 0 1             113                  ................(i)
        8 7 6 5 4 3 2 1

                      ⬇
        0 0 0 0 0 0 0 1             1
        8 7 6 5 4 3 2 1

        So, now 1 << k-1 , will be

                ⬇
        0 0 0 0 1 0 0 0             1<<k-1 i.e. 3        ..............(ii)
        8 7 6 5 4 3 2 1

        Do "or" of eqn i and ii
        i.e.    1<<(k-1) | n

                ⬇
        0 1 1 1 0 0 0 1             113                  ................(i)
        0 0 0 0 1 0 0 0             1<<k-1 i.e. 3        ..............(ii)
  ==>   0 1 1 1 1 0 0 1
                ⬆                   0 is now set to 1

       Doing "or" of any with 0 will give same            i.e.   0|0 => 0       1|0 => 1
       Doing "or" of any with 1 will give always "1"      i.e.   0|1 => 1       1|1 => 1

         */

    }
}
