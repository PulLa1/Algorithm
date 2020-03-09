package com.pulla.algorithm.course;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author: Pulla
 * @Date: 2020/3/8 22:52
 * @Description:
 */
public class BinarySearch {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        System.out.println(instance.get(Calendar.HOUR) +" vs "+instance.get(Calendar.HOUR_OF_DAY));
    }

    public int BinarySearch(int[] list,int key){
        int low = 0;
        int high = list.length;
        while (low <= high){
            int mid = low +(high - low)/2;
            if (key > list[mid]){
                //right
                low = mid+1;
            }else if (key < list[mid]){
                high= mid -1;
            }else if (key == list[mid]){
                return mid;
            }
        }
        return -1;
    }
}
