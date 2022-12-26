package com.company;

public class b9ReverseNumber {
    public static void main(String[] args) {
        reverse1(58785754);
        System.out.println(sum);

        System.out.println(reverse2(1234));
    }



    //Approach - 01 : See Notes-31
    static int sum = 0;                     //"static int" because, it is used outside the scope
    // https://www.javatpoint.com/java-variablesc  ==> Static variable  used anywhere in the code

    static void reverse1(int n) {
        if(n <= 0) {                     //i.e. nothing is left in the provided number
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;

        reverse1(n/10);               //Find the reverse of the remaining digits of the number
    }
    //Now, reverse of number is there in the "sum", we can now just print that "sum"
    //Above "reverse1" method does not return anything, it's work is just to reverse provided number
    //Hence, it's return type is "void"'















    //Approach - 02 : See Notes-32
    //Sometimes, we need an additional variables in argument, so in that case make use of additional function
    static int reverse2(int n) {
        //Digit of n = log10(n)+1
        int digits = (int)(Math.log10(n) + 1);

        return helper(n, digits);
    }


    static int helper(int n, int digits) {

        //Base Case : If number is a single digit, then reverse will also be the same
        if(n % 10 == n) {                 //OR n < 10

            return n;
        }

        int rem = n%10;                             //Get last digit
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
}
