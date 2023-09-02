package com.Gfg;

import java.util.Arrays;

public class FindMissingAndRepeating {
    public static void main(String[] args) {
        int[] arr = {1,3,3};
        int n=3;
        int[] nums = new int[2];
        //HashSet<Integer> hash = new HashSet<>();
        int xor = 1;
        for(int i=2;i<=n;i++){

            xor=xor^i;
        }
        for(int i=0;i<n;i++){
            xor = xor^arr[i];
        }
        int z = xor;
        int c=0;
        while(xor!=0){
            if((xor&1)==1){
                break;
            }
            c++;
            xor=xor>>1;
        }
        int xor1=z;
        int xor2=z;
        for(int i=1;i<=n;i++){
            if((i & (1<<c)) == 0){
                xor1=xor1^i;
            }
            else{
                xor2=xor2^i;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==xor1){
                nums[0] = xor1;
                nums[1] = xor2;
            }
            else if(arr[i]==xor2){
                nums[0] = xor2;
                nums[1] = xor1;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
