//Fibonacci Number : https://github.com/YourOwnItsMeDHC/ProgramBasics/blob/master/src/deepak/FibonacciNumber.java
//Fibonacci Series : https://github.com/YourOwnItsMeDHC/ProgramBasics/blob/master/src/deepak/FibonacciSeries.java

package com.company;
public class a4FibonacciNumber {
    public static void main(String[] args) {
        int ans = fibonacci(49);
        System.out.println(ans);
    }

    static int fibonacci(int n) {
        if(n < 2) {
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

}
