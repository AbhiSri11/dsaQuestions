package com.company2;
import java.util.HashSet;
public class HashUnionOfTwoArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3};
        int[] arr2 ={2,6,7,8,0};
        int s = count(arr,arr2);
        System.out.println(s);
    }
    static int count(int[] a,int[] b){
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            s.add(b[i]);
        }
        return s.size();
    }
}
