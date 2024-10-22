package com.biswajit.condigpatterns.twopointer;

/*
https://leetcode.com/problems/is-subsequence/description/?envType=problem-list-v2&envId=two-pointers&
 */

public class IsSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("axc","ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) return true;
        if(s.equals(t)) return true;

        int j = 0;
        for(int i = 0 ; i < t.length() ; i++){
            if(t.charAt(i) == s.charAt(j)){
                j++;
                if(j == s.length()) return true;
            }
        }
        return false;
    }
}
