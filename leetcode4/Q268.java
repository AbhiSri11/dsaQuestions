package com.leetcode4;

public class Q268 {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int i =0;
        int ans = arr.length;
        while(i<arr.length){
            while(arr[i]<arr.length && arr[arr[i]]!=i){
                int temp=arr[arr[i]];
                arr[arr[i]]=arr[i];
                arr[i]=temp;
            }
            i++;
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i) System.out.println(i+"uu");
        }
        System.out.println(ans);
    }
}
