package com.company;

public class StringBuildeR {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        for(int i=0; i<26; i++) {
            char letter = (char)('a'+i);
            builder.append(letter);
        }

        System.out.println(builder); //abcdefghijklmnopqrstuvwxyz

        System.out.println(builder.deleteCharAt(0)); //bcdefghijklmnopqrstuvwxyz

        System.out.println(builder.insert(0, 'h')); //hbcdefghijklmnopqrstuvwxyz

        System.out.println(builder.reverse()); //zyxwvutsrqponmlkjihgfedcbh

    }
}
