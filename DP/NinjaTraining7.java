package com.DP;

public class NinjaTraining7 {
    //memorization
    public static void main(String[] args) {
        int[][] nums = {{1,2,5},{3,1,1},{3,3,3}};
        int[][] dp = new int[nums.length][4];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<4;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(pic(0,3,nums,dp));
    }
    public static int pic(int n,int i,int[][] nums,int[][] dp){
        if(nums.length<=n) return 0;
        int maxi = 0;
        if(dp[n][i]!=-1) return dp[n][i];
        for(int j=0;j<3;j++){
            if(j!=i){
                int point = nums[n][j] + pic(n+1,j,nums,dp);
                maxi = Math.max(maxi,point);
            }
        }
        return dp[n][i] = maxi;
    }





//    public static void main(String[] args) {
//        //tabulation
//        int[][] nums = {{1,2,5},{3,1,1},{3,3,3}};
//        int[][] dp = new int[nums.length][4];
//        dp[0][0] = Math.max(nums[0][1],nums[0][2]);
//        dp[0][1] = Math.max(nums[0][0],nums[0][2]);
//        dp[0][2] = Math.max(nums[0][0],nums[0][1]);
//        dp[0][3] = Math.max(nums[0][0],Math.max(nums[0][2],nums[0][1]));
//        int last = -1;
//        for(int i=1;i<nums.length;i++){
//            for(int j=0;j<4;j++){
//                dp[i][j] = 0;
//                for(int task =0; task<3;task++){
//                    if(last != j){
//                        int point = nums[i][task] + dp[i-1][task];
//                        dp[i][j] = Math.max(dp[i][j],point);
//                    }
//                }
//            }
//        }
//        System.out.println(dp[nums.length-1][3]);
//    }




}
