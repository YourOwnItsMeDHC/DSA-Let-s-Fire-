package com.company;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Deepak Chourasiya is handsome";
        String name2 = "Suraj";
        String name3 = "Deepak";

        //name.toCharArray ==> convert string into array of data type character
        //Arrays.toString ==> Print that Array
        System.out.println(Arrays.toString(name.toCharArray())); //[D, e, e, p, a, k,  , C, h, o, u, r, a, s, i, y, a,  , i, s,  , h, a, n, d, s, o, m, e]

        System.out.println(name.toLowerCase()); //deepak chourasiya is handsome
        System.out.println(name.toUpperCase()); //DEEPAK CHOURASIYA IS HANDSOME
        System.out.println(name.charAt(23)); //n
        System.out.println(name.compareTo(name2)); //-15
        System.out.println(name.compareTo(name3)); //23
        System.out.println(name.concat(name2)); //Deepak Chourasiya is handsomeSuraj
        System.out.println(name.contains("Deepak")); //true
        System.out.println(name.indexOf("Chourasiya")); //7
        System.out.println(name.lastIndexOf("Deepak")); //0
        System.out.println(name.length()); //29
        System.out.println(name.isEmpty()); //false

        String name4 = "          Deepak Dada            ";
        System.out.println(name4.strip()); //Deepak Dada          [Neglects white or blank spaces]

        System.out.println(Arrays.toString(name.split(" "))); //[Deepak, Chourasiya, is, handsome]
        //Breaks the string, whereevver there is " " ==> blank spaces

    }
}
