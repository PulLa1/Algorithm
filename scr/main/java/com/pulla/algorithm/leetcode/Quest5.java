package com.pulla.algorithm.leetcode;

public class Quest5 {
    public static void main(String[] args) {
        Quest5 quest5 = new Quest5();
        System.out.println(quest5.longestPalindrome("adda"));
    }

    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int[] result = new int[2];
        if (chars.length <=1){
            return s;
        }
        for (int i = 0;i<chars.length;i++){
            int lo = i;
            int hi = lo;
            while (hi<chars.length-1 &&chars[lo] == chars[hi+1]){
                hi++;
            }
            while (lo >0 && hi<chars.length-1&&chars[lo-1]==chars[hi+1]){
                lo--;
                hi++;
            }
            if (hi-lo>result[1]-result[0]){
                result[0] = lo;
                result[1] = hi;
            }
        }
        return s.substring(result[0],result[1]+1);
    }


}
