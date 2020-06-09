package com.pulla.algorithm.leetcode;

public class Q24 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(spiralOrder(a));
    }

    public static int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0 ) {
            return new int[0];
        }
        int[] reslt = new int[matrix.length * matrix[0].length];
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] checks = new int[rows][columns];
        int total = rows * columns;
        int x = 0, y = 0;
        //0右  1 下  2 左  3右
        int focs = 0;
        for (int i = 0; i < total; i++) {
            reslt[i] = matrix[y][x];
            checks[y][x] = 1;
            //右
            if (focs == 0 && x + 1 < columns && checks[y][x + 1] != 1) {
                x++;
                continue;
            }else {
                focs = 1;
            }
            //下
            if (focs == 1 && y + 1 < rows && checks[y + 1][x] != 1) {
                y++;
                continue;
            }else {
                focs = 2;
            }
            //左
            if (focs == 2 && x - 1 >= 0 && checks[y][x - 1] != 1) {
                x--;
                continue;
            }else {
                focs = 3;
            }
            //上
            if (focs == 3 && y - 1 >= 0 && checks[y - 1][x] != 1) {
                y--;
                continue;
            }else {
                focs = 0;
            }
            //右
            if (focs == 0 && x + 1 < columns && checks[y][x + 1] != 1) {
                x++;
                continue;
            }
        }
        return reslt;
    }

}
