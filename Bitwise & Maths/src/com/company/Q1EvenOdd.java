/* Traditional Approach (Finding Remainder) :
https://github.com/YourOwnItsMeDHC/ProgramBasics/blob/c2b28ff207d022b4f3c443b5748af7722865fde2/src/deepak/IdentifyOddEven.java

Whenever we and(&) any number(n) with 1 , we get that number(n) itself.
Eg : n=18  1 0 0 1 0
         & 1 1 1 1 1
        == 1 0 0 1 0

        Binary : 2^5 2^4 2^3 2^2 2^1 2^0
      ......     32   16  8   4   2   1⬅LSB
      ......     ⬆____Even nos.____⬆   ⬆(odd no.)

      Last bit of Binary number is called as LSB i.e. Least Significant Bit

      So, if LSB is 1 ===> Number is Odd
          if LSB is 0 ===> Number is Even

          n=18  1 0 0 1 0
              & 1 1 1 1 1
             == 1 0 0 1 0<=LSB is 0       ==> n = 18 = Even

          n=17  1 0 0 0 1
              & 1 1 1 1 1
             == 1 0 0 0 1<=LSB is 1       ==> n = 17 = Odd
*/


package com.company;
public class Q1EvenOdd {

    public static void main(String[] args) {

//        int n = 18;  //false
        int n = 17;    //true
        System.out.println(isOdd(n));

    }

    static boolean isOdd(int n) {
        return (n & 1) == 1;

       //n=19 & 1     ==   1    ???
       // n=19  1 0 0 1 1               ====> 1 0 0 1 1
       //     &         1               ====> 0 0 0 0 1
       //                                     0 0 0 0 1       ==> 1  ==> isOdd ==> True i.e. 19 is Odd
    }

}
