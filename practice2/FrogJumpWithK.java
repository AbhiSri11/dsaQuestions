package com.practice2;

public class FrogJumpWithK {
    public static void main(String[] args) {
        int[] arr = {10,20,30,10};
        int[] dp = new int[arr.length];
        dp[0] = 0;
        int k=3;
        //dp[1] = arr[1]-arr[0];

        for(int i=2;i<dp.length;i++){
            int min = 0;
            for(int j = 1;j<=k;j++){
                if(i-j>=0) dp[i] = Math.min(min,Math.abs(arr[i]-arr[i-j]) + dp[i-j]);
            }
//            int left = dp[i-1] + Math.abs(arr[i]-arr[i-1]);
//            int right = dp[i-2] + Math.abs(arr[i]-arr[i-2]);
//            dp[i] = Math.min(left,right);
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
//        int min = 0;
//        for(int p=1;p<=3;p++){
//            if(i-p>=0) min = Math.min(min,Math.abs(arr[i] - arr[i-p]) + mini(i-p,arr));
//        }
//        return min;
//    }
}
