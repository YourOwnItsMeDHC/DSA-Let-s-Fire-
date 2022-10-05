//Q : Print N to 1 and also 1 to N
//Eg :
//    5 4 3 2 1
//    1 2 3 4 5

package com.company;
public class b3Nto1andAlso1toN {
    public static void main(String[] args) {
        both(5);
    }

    static void both(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        both(n-1);
        System.out.println(n);
    }
}
