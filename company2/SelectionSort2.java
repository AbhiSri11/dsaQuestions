package com.company2;
import java.util.*
;public class SelectionSort2 {
    public static void main(String[] args) {
        int [] arr ={-2,7,5,9,-5,-7,0,1,8};
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int []arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-1-i;
            int max = max(arr,0,last);
            swap(arr,max,last);
        }
    }
    static void swap(int[]arr,int max, int last){
        int temp = arr[last];
        arr[last]=arr[max];
        arr[max]=temp;
    }
    static int max(int[] arr, int start, int last){
        int max=arr[0];
        int c;
        for(int j=start;j<=last;j++){
            if(arr[j]>max){
                max=j;
            }
        }
        return max;
    }
}
