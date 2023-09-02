package com.Gfg;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstNegativeInEveryWindowK {
    public static void main(String[] args) {
        long[] a = {-8, 2, 3, -6, 10};
        int k=2;
        long[] arr = new long[a.length - k +1];
        ArrayList<Long> list = new ArrayList<>();
        int i=0;
        int j=0;
        int p=0;
        while(j<a.length){
            if(a[j]<0) list.add(a[j]);
            if(j-i+1==k){
                if(list.size()==0){
                    arr[p++]=0;
                }
                else{
                    arr[p++] = list.get(0);
                    if(a[i++] == list.get(0)) list.remove(0);
                }
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));
//        return arr;
    }
}
