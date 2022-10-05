//Q : Print numbers from N to 1

package com.company;
public class b1Nto1 {
    public static void main(String[] args) {
        nto1(5);
    }

    static void nto1(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        nto1(n-1);
    }
}

//Here,
// we are printing "5", then we are calling recursive call for "4", then
//we are printing "4", then we are calling recursive call for "3", then
//we are printing "3", then we are calling recursive call for "2", then
//we are printing "2", then we are calling recursive call for "1", then
//we are printing "1", then all the function calls which were omto the stack will come out of the stack