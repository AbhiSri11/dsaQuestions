package com.DP;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "aaaabbaa";
        String rev = "";
        int p=s.length()-1;
        while(p>=0){
            rev = rev + s.charAt(p--);
        }
        int[][] dp = new int[s.length()+1][s.length()+1];
        String[][] arr = new String[s.length()+1][s.length()+1];

        for(int i=0;i<=s.length();i++){
            for(int j=0;j<=s.length();j++){
                arr[i][j] = "";
            }
        }

        for(int i=0;i<=s.length();i++) dp[i][0] = 0;
        for(int i=0;i<=s.length();i++) dp[0][i] = 0;
        int ans = 0;

        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=s.length();j++){
                if(s.charAt(i-1)==rev.charAt(j-1)){
                    arr[i][j] = arr[i][j] + s.charAt(i-1);
                    dp[i][j] = 1 + dp[i-1][j-1];
                    ans = Math.max(ans,dp[i][j]);
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }
        String z = "";
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=s.length();j++){
                if(arr[i][j]!="" && arr[i][j].length() == ans){
                    //max = arr[i][j].length();
                    z = arr[i][j];
                }
            }
        }
        for(int i=0;i<=s.length();i++){
            for(int j=0;j<=s.length();j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
