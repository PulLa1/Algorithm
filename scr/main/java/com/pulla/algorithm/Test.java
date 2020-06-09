package com.pulla.algorithm;


import java.util.ArrayList;
import java.util.HashMap;

public class Test {

    public static ArrayList<Integer> list= new ArrayList<Integer>();

    public static void main(String[] args) {
        list.add(0);
        Test test = new Test();
        ArrayList<Integer> aa = test.aa(list);
        System.out.println(aa.toString());
        ArrayList<Integer> bb = test.aa(list);
        System.out.println(aa.toString());
        System.out.println(bb.toString());
        System.out.println(list.toString());
    }

    public ArrayList<Integer> aa(ArrayList<Integer> list){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.addAll(list);
        list1.add(5);
        return list1;
    }
}
