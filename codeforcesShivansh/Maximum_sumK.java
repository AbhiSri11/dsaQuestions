package com.codeforcesShivansh;
import java.util.*;
public class Maximum_sumK {
    public static void main(String args[]){
        int n=3;
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(1);
        System.out.println(maximumSumSubarray(n,list));
    }
    public static int maximumSumSubarray(int k, ArrayList<Integer> arr){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0,j=0;j<arr.size();j++){
            if((i+j+1)<=k){
                sum+=arr.get(j);
                max=Math.max(max,sum);
                continue;
            }else{
                sum=(sum-arr.get(i++))+arr.get(j);
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}
