package com.pulla.algorithm.leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Q26 {

    public static void main(String[] args) {
        int[] a ={1,1,2};
        removeDuplicates(a);

        String a1 = "abc";
        String a2 = "abc";
        String a3 = new String("abc").intern();
        System.out.println(a1 ==a2);
    }

    public static int removeDuplicates(int[] nums) {
        Set<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int[] a = new int[list.size()];
        Integer[] integers = list.toArray(new Integer[list.size()]);
        for(int i=0;i<a.length;i++){
            a[i] = integers[i];
        }
        nums= a;
        return list.size();
    }


}
