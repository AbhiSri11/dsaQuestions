package com.practice2;

public class KadaneWithN2 {
    public static void main(String[] args) {
        int[] arr = {95,4,-1,7,8,4,3,2,-2,-6,-9,6,-4,-3,-33,3,4,6,7};
        int max=0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum = sum+arr[j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }
}
