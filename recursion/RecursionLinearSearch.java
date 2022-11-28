package com.recursion;

public class RecursionLinearSearch {
    public static void main(String[] args) {
        int [] arr ={1,2,3,18,9,8,7};
        int ans= main(arr,18,0);
        System.out.println(ans);
    }
    static int main(int[] arr,int target, int i){
        if(i==arr.length)
            return -1;
        if(arr[i]==target)
            return i;
        return main(arr,target,++i);
    }
}
