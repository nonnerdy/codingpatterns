package com.biswajit.condigpatterns.twopointer;

import java.util.Arrays;

/*
“The quick brown fox jumped over a lazy dog” -> “dog lazy a over jumped fox brown quick The”
 */
public class ReverseString {
    public static void main(String[] args) {
        String s = "The quick brown fox jumped over a lazy dog";
        System.out.println("Before reversing the string : "+s);
        System.out.print("After reversing the string : ");
        reverseString(s);
    }

    public static void reverseString(String s){
        String[] strArr = s.split(" ");
        int start = 0;
        int end = strArr.length - 1;

        while(start < end){
            String tmp = strArr[start];
            strArr[start] = strArr[end];
            strArr[end] = tmp;
            start++;
            end--;
        }

        for(int i = 0 ; i < strArr.length - 1 ; i++){
            System.out.print(strArr[i]);
            System.out.print(" ");
        }
    }
}
