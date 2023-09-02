package com.company3;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,5,8,0,2,4,7,0,2};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            int j=i+1;
            while(j<n){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                j--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
