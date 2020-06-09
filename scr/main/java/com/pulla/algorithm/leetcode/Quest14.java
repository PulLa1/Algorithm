package com.pulla.algorithm.leetcode;

public class Quest14 {
    public static void main(String[] args) {
        String[] strs = {"acba","abc"};
        System.out.println(Quest14.longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        char[] result = strs[0].toCharArray();
        int end = result.length;
        for(String str:strs){
            end= Math.min(end ,str.length());
            for (int i=0;i<end;i++){
                if (str.charAt(i) != result[i]){
                    end = i;
                    if (end == 0){
                        return "";
                    }
                }
            }
        }
        String a = "";
        for (int i=0;i<end;i++){
            a += result[i];
        }
        return a;
    }
}
