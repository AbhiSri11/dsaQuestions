package com.practice2;

import java.util.HashSet;

public class Codechef {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1,2,4};
        HashSet<Integer> hash = new HashSet<>();
        boolean flag = true;
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                int diff = arr[i]-arr[j-1];
                if(hash.contains(diff)){
                    System.out.println("No");
                    flag = false;
                    break;
                }
                hash.add(diff);
            }
            if(!flag) break;
        }
        if(flag) System.out.println("Yes");
    }
}
