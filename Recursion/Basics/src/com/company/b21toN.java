//Q : Print numbers from 1 to N

package com.company;
public class b21toN {
    public static void main(String[] args) {
        number(5);
    }

    static void number(int n) {
        if(n == 0) {
            return;
        }
        number(n-1);
        System.out.println(n);
    }
}

/*
Here, we are calling fuction(5)
fuction(5) is calling function(4)
fuction(4) is calling function(3)
fuction(3) is calling function(2)
fuction(2) is calling function(1)

Then function(1) is printing it's "n", and here it's "n" is "1"             Output : 1
After these, function(1) will get back to function(2)

Then function(2) is printing it's "n", and here it's "n" is "2"             Output : 1 2
After these, function(2) will get back to function(3)

Then function(3) is printing it's "n", and here it's "n" is "3"             Output : 1 2 3
After these, function(3) will get back to function(4)

Then function(4) is printing it's "n", and here it's "n" is "4"             Output : 1 2 3 4
After these, function(4) will get back to function(5)

Then function(5) is printing it's "n", and here it's "n" is "5"             Output : 1 2 3 4 5
After these, function(5) will get back to main()
And these, just program overs here.
 */
