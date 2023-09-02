package com.practice2;

public class PrefixAndSuffix {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] pre = new int[arr.length];
        int[] suff = new int[arr.length];
        int max = arr[0];
        int max2 = arr[arr.length-1];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            pre[i] = max;
            if(max2<arr[arr.length-i-1]){
                max2=arr[arr.length-i-1];
            }
            suff[arr.length-i-1] = max2;
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int p = Math.min(pre[i],suff[i]) - arr[i];
            ans = ans+p;
        }
        System.out.println(ans);
    }


}
