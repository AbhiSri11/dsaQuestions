package com.company2;
import java.util.*;
public class RunningArray {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6};
        int[] ans=fun(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] fun(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(i==0)
                continue;
            else
                arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
}
