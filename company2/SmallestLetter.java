package com.company2;

public class SmallestLetter {
    public static void main(String[] args) {
       char[] arr = {'c','d','f','j'};
       int target = 'a';
       int ans = main(arr,target);
        System.out.println(ans);

    }
    static int main(char[] arr, int target){
        int mid;
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            mid = start + (end - start)/2;
            if(arr[mid]==target)
                start = mid+1;
            else if(arr[mid]<target)
                start = mid+1;
            else
                end=mid-1;
        }
        return start;
    }
}
