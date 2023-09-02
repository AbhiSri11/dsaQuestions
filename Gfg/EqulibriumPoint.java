package com.Gfg;

public class EqulibriumPoint {
    public static void main(String[] args) {
        long[] arr = {1 ,3 ,5 ,2, 2};
        int n=5;
        if(n==1) System.out.println("0");;
        if(arr.length==2) System.out.println("-1");;
        long sum = 0;
        long sum2 =0;
        int min=-1;
        int i=0;int j=arr.length-1;
        while(i<j){
            if(sum>sum2) sum2+=arr[j--];
            else sum+=arr[i++];
        }
        if(sum == sum2)
            System.out.println(min);
        System.out.println(-1);
    }
}
