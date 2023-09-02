package com.codeforcesShivansh;
import java.util.*;
public class First_negative_in_every_window_of_k {
    public static void main(String args[]){
        //Scanner sc=new Scanner(System.in);
        int window_Size=2;
        int [] arr={12, -1, -7, 8, -15, 30, 16, 28};
        System.out.println(Arrays.toString(First_Negative_Int(arr,window_Size)));
    }
    public static int[] First_Negative_Int(int[] arr,int k){
        int[] ans=new int[arr.length];
        int index=0;
        int el=0;
        for(int i=0,j=0;j<arr.length;j++){
            if(i+j+1<=k){
                if(arr[j]<0 && el>=0){
                    el=j;
                    ans[index++]=arr[j];
                }
            }else{
                i++;
                if(i<=el && el<=j){
                    ans[index++]=arr[el];
                }else if(arr[j]<0){
                    el=j;
                    ans[index++]=arr[j];
                }else{
                    ans[index++]=0;
                }
            }
        }
        return ans;
    }
}
