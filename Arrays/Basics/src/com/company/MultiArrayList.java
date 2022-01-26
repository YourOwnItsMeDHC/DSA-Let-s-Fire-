package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Multi - Dimensional ArrayList

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();       //Create ArrayList Of ArrayList , which is o int type

        //Initialization
        for(int i=0; i<4; i++){               //"i" is ArrayLiat (i.e element of Outer Arraylist)
            list.add(new ArrayList<>());      //Add ArrayList at each index
        }

        System.out.println("Enter the Values for Multi-Dimensional ArrayList : ");

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                list.get(i).add(in.nextInt());   //Add all the inputs entered using inner loop in ith ArrayList which is running at outer loop
            }
        }

        System.out.println(list);                //Print ArrayList Of ArrayList
    }
}
