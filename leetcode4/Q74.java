package com.leetcode4;

public class Q74 {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int target = 11;
        int row=0;
        int column=arr.length-1;
        while(row<=column){
            int mid  = (row+column)/2;
            if(arr[mid][0] == target) {
                System.out.println("true");
                break;
            }
            else if(arr[mid][0]>target) column = mid-1;
            else row = mid+1;
        }
        if(column == -1 || column == arr.length) System.out.println("false");
        int st = 0;
        int end = arr[column].length-1;
        while(st<end){
            int mid = (st+end)/2;
            if(arr[column][mid] == target) {
                System.out.println("true");
                break;
            }
            else if(arr[column][mid] > target) end = mid-1;
            else st = mid + 1;
        }
        System.out.println("false");
    }
}
