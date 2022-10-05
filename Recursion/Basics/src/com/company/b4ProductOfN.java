//Q : Table or product of any "N" number

package com.company;
public class b4ProductOfN {
    public static void main(String[] args) {
        product(5, 10);
    }

    static void product(int ofWhat, int uptoWhat) {
        if(uptoWhat == 0) {
            return;
        }
        product(ofWhat, uptoWhat-1);
        System.out.println(ofWhat * uptoWhat);
    }
}
