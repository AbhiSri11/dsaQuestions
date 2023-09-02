package com.company3;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,4,2};
        for(int i=1;i<arr.length;i++){
            int num = arr[i];
            int j = i-1;
            while(j>0){
                if(arr[j-1]>arr[j]){
                    arr[j-1] = arr[j];
                    j--;
                }
                else{
                    j--;
                    break;
                }
            }
            arr[i] = num;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
