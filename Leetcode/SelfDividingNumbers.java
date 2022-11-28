package com.Leetcode;
import java.util.*;
public class SelfDividingNumbers {
    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        List<Integer> list = new ArrayList<>();
        list = selfDividingNumbers(left,right);
        System.out.println(list);
    }
    static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int k=i;
            int m=i;
            int c=0;
            int d,e=0;
            while(k>0){
                k=k/10;
                c++;
            }
            for(int j=0;j<c;j++){
                d=m%10;
                if(d==0){
                    break;
                }
                if(m%d==0)
                    e++;
                m=m/10;
            }
            if(e==c)
                list.add(i);
        }
        return list;
    }

}
