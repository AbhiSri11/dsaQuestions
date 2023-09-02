package com.BitManupulation;

public class TwoNumberArePresentOneTime {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,5};
        int xor = arr[0];
        for(int i=1;i<arr.length;i++){
            xor=xor^arr[i];
        }
        int c=0;
        while(xor!=0){
            if((xor&1)==1){
                break;
            }
            c++;
            xor=xor>>1;
        }
        int xor1=0;
        int xor2=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i] & (1<<c)) == 0){
                xor1=xor1^arr[i];
            }
            else{
                xor2=xor2^arr[i];
            }
        }
        System.out.println(xor1 + " "+ xor2);
    }
}