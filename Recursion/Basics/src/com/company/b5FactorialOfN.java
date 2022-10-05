
//Factorial : (Without Recursion)
//https://github.com/YourOwnItsMeDHC/ProgramBasics/blob/master/src/deepak/Factorial.java

//Visualize Factorial : 🔥🔥🔥
//https://www.educative.io/courses/recursion-for-coding-interviews-in-java/xl7GjENLLvE

package com.company;
public class b5FactorialOfN {
    public static void main(String[] args) {
        int ans = factorial(5);
        System.out.println(ans);
    }

    static int factorial(int n) {
        if(n <= 1) {                   //Because, Factorial of 1 is 1, and factorial of 0 is also 1
            return 1;
        }

        return n * factorial(n-1);
    }
}
