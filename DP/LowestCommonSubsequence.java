package com.DP;

public class LowestCommonSubsequence {
    public static void main(String[] args) {
        String S1 = "abcde";
        String S2 = "ace";

        int[][] dp = new int[S1.length()+1][S2.length()+1];
        for(int i=0;i<=S1.length();i++){
            dp[i][0] = 0;
        }
        for(int i=0;i<=S2.length();i++){
            dp[0][i] = 0;
        }
        for(int i=1;i<=S1.length();i++){
            for(int j=1;j<=S2.length();j++){
                if(S1.charAt(i-1)==S2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j]  = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        System.out.println(dp[S1.length()][S2.length()]);




        //     int[][] dp = new int[S1.length()][S2.length()];
        //     for(int i=0;i<S1.length();i++){
        //         for(int j=0;j<S2.length();j++){
        //             dp[i][j] = -1;
        //         }
        //     }
        //     return common(S1.length()-1,S2.length()-1,S1,S2,dp);
        // }
        // public int common(int i, int j ,String s1, String s2,int[][] dp){
        //     if(i==-1 || j == -1) return 0;
        //     if(dp[i][j] != -1) return dp[i][j];
        //     int equal = 0;
        //     int notEqual = 0;
        //     if(s1.charAt(i)==s2.charAt(j)) equal = 1 + common(i-1,j-1,s1,s2,dp);
        //     else{
        //         notEqual = Math.max(common(i,j-1,s1,s2,dp),common(i-1,j,s1,s2,dp));
        //     }
        //     return dp[i][j] = Math.max(equal,notEqual);
    }
}
