//Golden Ratio Fibonacci Java Code : https://www.baeldung.com/java-fibonacci#:~:text=The%20Fibonacci%20terms%20maintain%20a,)%2F2%20%3D%201.6180339887...&text=Actually%2C%20this%20means%20that%20we,number%20with%20just%20some%20arithmetic.

/*
Fibonacci Numbers and the Golden Ratio (Must Check) :
https://math.libretexts.org/Bookshelves/Applied_Mathematics/Book%3A_College_Mathematics_for_Everyday_Life_(Inigo_et_al)/10%3A_Geometric_Symmetry_and_the_Golden_Ratio/10.04%3A_Fibonacci_Numbers_and_the_Golden_Ratio

The Golden Ratio: ϕ = 1+√5 / 2

The Golden Ratio has the decimal approximation of  ϕ=1.6180339887

Binet’s Formula: The nth Fibonacci number is given by the following formula:

fn = [(1+√5 / 2)^n − (1-√5 / 2)^n] / √5

(Finally, you can use a shortcut combination to insert the square root key.
On your keyboard, press Alt, 2, 5 and then 1)
 */

package com.company;
public class a6GoldenRatio {
    public static void main(String[] args) {
        int ans =  fib(15666546);
        System.out.println(ans);                           //2147483647

        //Here, we can get fibonacci of any big number as well.
    }

    static int fib(int n) {
        return (int)((Math.pow(((1+Math.sqrt(5))/2), n) - Math.pow(((1-Math.sqrt(5))/2), n)) / Math.sqrt(5));
    }

}
