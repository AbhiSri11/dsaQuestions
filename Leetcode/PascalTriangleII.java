package com.Leetcode;
import java.util.*;
public class PascalTriangleII {
    public static void main(String[] args) {
        int k=5;
        List<Integer> list=new ArrayList<>();
        list = getRow(5);
        System.out.println(list);
    }
    static List<Integer> getRow(int k) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        if (k == 0)
            return list;
        list.add(1);
        if (k == 1)
            return list;
        int p=0;
        for (int i = 1; i < k; i++) {
            //int p=0;
            for(int j=i-1;j<i;j++){
                p=list.get(i) + list.get(i - 1);

            }
            list.add(p, p);
        }
        // list.add(1,2);
        return list;
    }
}
