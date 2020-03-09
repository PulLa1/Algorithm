package com.pulla.algorithm.leetcode;

public class Quest4 {

    public static void main(String[] args) {
        Quest4 quest4 = new Quest4();
        int[] a1= {1,2};
        int[] a2= {3,4};
        double v = quest4.findMedianSortedArrays(a1, a2);
        System.out.println(v);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //合并数组
        int[] sum = new int[nums1.length + nums2.length];
        int lo1 = 0;
        int lo2 = 0;
        for (int i = 0; i < sum.length; i++) {
            if (lo1 >= nums1.length){
                sum[i] = nums2[lo2++];
            }else if (lo2 >= nums2.length){
                sum[i] = nums1[lo1++];
            }else if (nums1[lo1] >= nums2[lo2]) {
                sum[i] = nums2[lo2++];
            } else {
                sum[i] = nums1[lo1++];
            }
        }
        int i = sum.length / 2;
        if (2 * i != sum.length){
            return sum[i];
        }else {
            return (sum[i]+sum[i-1])/2.0;
        }
    }
}
