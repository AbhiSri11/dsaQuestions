package com.company2;

public class PivotElement {
    public static void main(String[] args) {
        int[] arr={145, 158, 10, 13, 23, 39, 50, 58, 64, 77, 82, 93, 110, 114, 122, 140};
        //int [] arr={1};
        int ans = main(arr);
        System.out.println(ans);
    }
    static int main(int[]arr){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<end){
            mid=start+(end-start)/2;
            if(arr[mid]>=arr[0])
                start = mid+1;
            else
                end=mid;
        }
        return arr[start];
    }
}
