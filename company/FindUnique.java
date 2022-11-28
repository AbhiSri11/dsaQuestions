package com.company;

public class FindUnique {
    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,4,5,7,3,2,1};
      int ans = main(arr);
        System.out.println(ans);
    }
    static int main(int[] arr){
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            ans =ans^arr[i];
        }
        return ans;
    }
}
