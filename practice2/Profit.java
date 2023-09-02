package com.practice2;

public class Profit {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int min=0;
        int pro = 0;
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(i<arr.length-1 && arr[i]>arr[i+1]){
                pro += arr[i]-arr[j];
                j=i+1;
            }
            else{
                if(arr[j]<arr[i]) pro += arr[i]-arr[j];
            }
        }
        System.out.println(pro);
    }
}
