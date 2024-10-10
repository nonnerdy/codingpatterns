package com.biswajit.condigpatterns.twopointer;

/*
Write a function that takes a string, s, as an input and determines whether or not it is a palindrome.

Note: A palindrome is a word, phrase, or sequence of characters that reads the same backward as forward.

The string s will not contain any white space and will only consist of ASCII characters(digits and letters).
 */

public class ValidPallindrome {
    public static void main(String[] args) {
        System.out.println("Using 2 pointer method check if this string is palindrome : "+isPallindrome("AABBCCCCBBAA"));
    }


    public static boolean isPallindrome(String s){
        //ABA is pallindrome
        for(int i = 0, j = s.length() -1 ; i< s.length(); i++,j--){
            if(s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
}




