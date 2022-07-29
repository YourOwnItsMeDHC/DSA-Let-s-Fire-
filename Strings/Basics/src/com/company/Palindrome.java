package com.company;

public class Palindrome {
    public static void main(String[] args) {

//        //Approach 1 - UsingStringbuilder :
//        String word = "rapspar";
//
//        int length = word.length();
//        StringBuilder reverse = new StringBuilder();
//        for(int i=length-1; i>=0; i--) {
//            reverse.append(word.charAt(i));
//        }
//
//        if(word.contentEquals(reverse)) {
//            System.out.println(word + " is a Palindrome string"); //rapspar is a Palindrome string
//        }
//        else {
//            System.out.println(word + " is not a Palindrome string");
//        }






        //Approach - 2 :
        //Above we were using extra space to store reverse of string i.e. we use StringBuilder
        //In palindrome, starting index will be equals to ending index

//        String word = ""; //true
//        String word = null; //true
//        String word = "Deepak"; //false
//        String word = "abcdcba"; //true
        String word = "abccba"; //true
        System.out.println(isPalindrome(word));

    }

    static boolean isPalindrome(String word) {

        //Edge case : Check whether string is empty or not :
        //if(string is not declared yet || string is declared, but an empty string is declared)
        if(word == null || word.length() == 0) {
            return true;
        }

        word = word.toLowerCase(); //Edge case - there might be the case , where letters are of small and capital, both mixed type

        for(int i=0; i<=word.length()/2; i++) {
            char start = word.charAt(i);
            char end = word.charAt(word.length()-1-i);
            if(start != end) {
                return false;
            }
        }
        return true;

    }

}
