package com.pulla.algorithm.leetcode;

public class Quest945 {
    public int minIncrementForUnique(int[] A) {
        int[] countList = new int[40001];
        int result = 0;
        for (int i = 0;i<A.length;i++){
            int a = A[i];
            while (countList[a] != 0){
                result++;
                a++;
            }
            countList[a] =1;
        }
        return result;
    }

    //优化
    public int minIncrementForUnique2(int[] A) {
        int[] countList = new int[40001];
        int result = 0;
        int max = -1;
        for (int i : A){
            countList[i]++;
            max = Math.max(max,i);
        }
        for (int i= 0;i<max+1;i++){
            if (countList[i] > 1){
                int sub = countList[i] - 1;
                countList[i+1] += sub;
                result +=sub;
            }

        }
        int d = countList[max +1] -1;
        result += d*(d+1)/2;
        return result;
    }



}
