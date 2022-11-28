package com.stack;
public class LargestAreaHistogramByLoop {
    public static void main(String[] args) {
        int[] arr = {3,2,5,1,4,2};
        int max=0;
        for(int i=0;i<arr.length;i++){
            int ans = 0;
            int p=i;
            int j=i+1;
            while(p>=0 && j<arr.length){
                if(arr[p]>=arr[i]) {
                    ans++;
                    p--;
                }
                else
                    break;
                if(arr[j]>=arr[i]) {
                    ans++;
                    j++;
                }
                else
                    break;
            }
            if(max<ans*arr[i])
                max = ans*arr[i];
        }
        System.out.println(max);
    }
}
