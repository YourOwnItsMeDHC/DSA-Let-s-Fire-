package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //ArrayList<wrapper class of data type> list = new ArrayList<optional: add same wrapper class of data tye>(constructor i.e default value);
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(10);         //list.add(element value) = adds or insert element in Array
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        System.out.println(list);   //Prints the Array , These list internally calls Array.toString() only

        System.out.println();       //Line Spacing

        System.out.print("The Size Of Array is : ");
        System.out.println(list.size());                 //Prints The Size Of An Array

        System.out.println();

        System.out.print("Is 90 there in the Array : ");
        System.out.println(list.contains(90));              //Prints whether the element specified is there in Array or Not
        System.out.print("Is 576 there in the Array : ");
        System.out.println(list.contains(576));

        System.out.println();
        list.set(3, 420);                         //Update or set 4th index(i.e 40) into 420
        System.out.print("Update Element of index 3 by 420 : ");
        System.out.println(list);

        list.remove(3);                     //removes element of specified index
        System.out.print("Remove Element from index 3 : ");
        System.out.println(list);
        System.out.println();

        list.clear();  //used to remove all of the elements from the List container. This method does not deleted the List container, instead it justs removes all of the elements from the List
        System.out.print("Empty List Container , as all Elements is removed : ");
        System.out.println(list);

        //Take Input Using "fer" loop
        System.out.print("Enter 10 Values for an Array : ");
        for(int i=0; i<10; i++){
            list.add(in.nextInt());
        }

        //Method : 1 of Printing Output
        System.out.println(list);

        //Method : 2 of Printing Output
        for(int i=0; i<10; i++){
            System.out.print(list.get(i) + " ");  //arr[i] or list[i] is wrong , list.get(i) is coorect
        }
    }
}

    /*
    In ArrayList , we can't specify data type (eg:int) , so we have to use wrapper class (eg: Integer)
    The wrapper classes in Java are used to convert primitive types ( int , char , float , etc) into corresponding objects
     */
