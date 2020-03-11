package com.pulla.algorithm.course;

/**
 * @Author: Pulla
 * @Date: 2020/3/8 22:52
 * @Description:
 */
public class FastSort {
    public static void main(String[] args) {
        int[] aa = {2,1,3,14,5,6,7,1,8};
        sort(aa);
        for (int a : aa){
            System.out.println(a);
        }
    }
    public static void sort(int[] a){
        //随机排序

        sort(a,0,a.length-1);
    }

    private static void sort(int[] a ,int low,int hi){
        if (hi <= low) return;
        int j = partition(a,low,hi);
        sort(a,low,j-1);
        sort(a,j+1,hi);
    }

    private static int partition(int[] a,int lo,int hi){
        int i= lo,j=hi+1;
        int v = a[lo];
        while (true){
            while (a[++i]<v){
                if (i == hi) break;
            }
            while (a[--j]>v){
                if (j==lo) break;
            }
            if (i>=j) break;
            int temp = a[i];
            a[i] =  a[j];
            a[j] = temp;
        }
        int temp = a[lo];
        a[lo] =  a[j];
        a[j] = temp;
        return j;
    }

}
