package com.company;

public class PerformanceOrSeriesOfAlphabets {
    public static void main(String[] args) {
        String series = "";
        for(int i=0; i<26; i++) {
            char letter = (char)('a'+i);
//            System.out.println(letter); //a to z (with line spacing)
            series += letter;
//            series += " "; //Just for spacing between the characters ==> a b c d e f g h i j k l m n o p q r s t u v w x y z
        }

        System.out.println(series); //abcdefghijklmnopqrstuvwxyz
    }
}
