package com.company3;
import java.util.*;
public class hashCountDistinctElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4,};
        int s = count(arr);
        System.out.println(s);
    }
    static int count(int[] arr){
       HashSet<Integer> s = new HashSet<>();
       for(int i=0;i<arr.length;i++){
           s.add(arr[i]);
       }
       return s.size();
    }
}
