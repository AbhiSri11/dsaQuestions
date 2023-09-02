package com.practice2;

public class FrogJump {
    public static void main(String[] args) {
        int[] arr = {10,20,30,10};
        int[] dp = new int[arr.length];
        dp[0] = 0;
        dp[1] = arr[1]-arr[0];
        for(int i=2;i<dp.length;i++){
            int left = dp[i-1] + Math.abs(arr[i]-arr[i-1]);
            int right = dp[i-2] + Math.abs(arr[i]-arr[i-2]);
            dp[i] = Math.min(left,right);
        }
        System.out.println(dp[dp.length-1]);
    }


//    public static void main(String[] args) {
//        int[] arr = {10,20,30,10};
//        System.out.println(mini(arr.length-1,arr));
//    }
//    public static int mini(int i, int[] arr){
//        if(i == 0) return 0 ;
//        if(i<0) return 8888;
//        int one = Math.abs(arr[i] - arr[i-1]) + mini(i-1,arr);
//        int two = Integer.MAX_VALUE;
//        if(i>1) two = Math.abs(arr[i] - arr[i-2]) + mini(i-2,arr);
//        return Math.min(one,two);
//    }
}
