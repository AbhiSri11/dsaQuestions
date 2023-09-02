package com.DP;

public class PrintingLowestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "gefrdfgks";
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<=s1.length();i++){
            dp[i][0] = 0;
        }
        for(int i=0;i<=s2.length();i++){
            dp[0][i] = 0;
        }
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j]  = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        int len = dp[s1.length()][s2.length()];
        char[] ans = new char[len];
        int ind = len-1;
        int i=s1.length();
        int j=s2.length();
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                ans[ind--] = s1.charAt(i-1);
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                i--;
            }
            else{
                j--;
            }
        }
        for(int p= 0;p<len;p++) System.out.print(ans[p]);
    }
}
