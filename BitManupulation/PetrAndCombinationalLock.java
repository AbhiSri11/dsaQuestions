package com.BitManupulation;

import java.util.Scanner;

public class PetrAndCombinationalLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int cnt=0;
        int ans = 0;
        for(int i=0;i<(1<<n);i++){
            for(int j=0;j<n;j++){
                if((i & (1<<j))==0){
                    ans = ans - arr[j];
                }
                else{
                    ans=ans+arr[j];
                }
            }
            if(ans == 0 || ans == 360 || ans==-360){
                cnt++;
            }
            ans = 0;
        }
        if(cnt>0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
