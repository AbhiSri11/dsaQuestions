package com.company2;

import java.util.HashSet;

public class HashIntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] arr= {5,10,15,5,10};
        int[] arr2={15,10,4};
        int s = count(arr,arr2);
        System.out.println(s);

    }
    static int count(int[] a,int[] b){
        int count=0;
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            if(s.contains(b[i]))
                count++;
            s.remove(b[i]);
        }
        return count;
    }
}
