/* n = 5

   1 2 3 4 5

1   * * * * *
2   *       *
3   *       *
4   *       *
5   * * * * *


 First(1) and Last(5) row as well as column position have "*"
 Rest of the positions are having spaces i.e. " "

 */
package com.company;
import java.util.Scanner;
public class ZPattern32HollowRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for n : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(i==1 || i==n || j==1 || j==n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



/* Output :

Enter the value for n :
5
*****
*   *
*   *
*   *
*****

 */
