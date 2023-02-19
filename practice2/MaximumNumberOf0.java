package com.practice2;

public class MaximumNumberOf0 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1,0,0,0};
        int k=3;
        int p=0;int max=0;
        int ans=0;
        int i=0;int j=0;
        while(j<arr.length){
            if(ans<=k){
                if(arr[j]==0){
                    ans++;
                }
                if(ans<=k){
                    p++;
                    if (max < p){
                        max = p;
                    }
                }
                j++;
            }
            else{
                if(arr[i]==0){
                    ans--;
                }
                i++;p--;
            }
        }
        System.out.println(max);
    }
}
