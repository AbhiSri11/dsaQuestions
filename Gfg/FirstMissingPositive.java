package com.Gfg;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=arr.length && arr[i]>0){
                while(i<arr.length && arr[i]!=i+1){
                    int temp = arr[arr[i]-1];
                    arr[arr[i]-1] = arr[i];
                    arr[i] = temp;
                }
                i++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1) System.out.println(i+1);
        }
        System.out.println(arr.length+1);
    }
}
