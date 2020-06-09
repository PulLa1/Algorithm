package com.pulla.algorithm.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class Q128 {
    public static void main(String[] args) {
        int[] a = {2147483646,-2147483647,0,2,2147483644,-2147483645,2147483645};
        System.out.println(longestConsecutive(a));
    }


    public static int longestConsecutive(int[] nums) {
        Set<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toSet());



        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(list);
        if (treeSet.size() == 0){
            return 0;
        }
        int temp = Integer.MIN_VALUE;
        int max = 1;
        int tmp = 0;
        for (Integer i : treeSet) {
            if (i-temp == 1){
                tmp++;
                max = Math.max(max,tmp);
            }else {
                tmp = 1;
            }
            temp = i;
        }
        return max;
    }

}
