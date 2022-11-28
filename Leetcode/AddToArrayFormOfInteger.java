package com.Leetcode;
import java.util.*;
public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] arr ={1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k = 516;
        ArrayList<Integer> ans=new ArrayList<>();
        ans =addToArrayForm(arr,k);
        System.out.println(ans);

    }
    static ArrayList<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        long n=0;
        for(int i=0;i<num.length;i++){
            n=num[i]+n*10;
        }
        long ans=n+k;
        long d=(int)Math.log10(ans);
        while(d>=0){
            long m= (long)Math.pow(10,d);
            int p = (int)(ans / m);
            ans=ans%m;
            list.add(p);
            d--;
        }

        return list;
    }
}
