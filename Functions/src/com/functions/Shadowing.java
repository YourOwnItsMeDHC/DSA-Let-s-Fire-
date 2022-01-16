package com.functions;

public class Shadowing {
    static int a = 10;
    /*
    The variables which are declared inside the class but outside the body of the method are called the Instance variables.
    They are also known as Non-static fields.
     */

    public static void main(String[] args) {
        System.out.println(a);

        int a = 20;            //local variable , a=10 wil be shadowed here in these line

        System.out.println(a);   //a=10 is shadowed , line 15 will print a = 20

        shadow();                //line 17 will print instant variable value a = 10
                                 // because shadow() is called outside main() , having value a=10
    }

    static void shadow(){
        System.out.println(a);
    }
}

      /*
      Shadowing in Java is the practice of using variables in overlapping scopes with the same name
      where the variable in low-level scope overrides the variable of high-level scope.
      Here the variable at high-level scope is shadowed by the low-level scope variable.
       */
