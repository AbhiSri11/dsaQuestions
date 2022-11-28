package com.company;
public class FloorOfNumber {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int ans = main(arr,15);
        System.out.println(ans);
    }
    static int main(int[] arr, int target){
        int mid;
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            mid = start + (end - start)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                start = mid+1;
            else
                end=mid-1;
        }
        return end;
    }
}
