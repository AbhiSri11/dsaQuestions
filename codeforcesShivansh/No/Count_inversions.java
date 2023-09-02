package com.codeforcesShivansh.No;

public class Count_inversions {
    public static void main(String[] args) {
        long arr[]={5,3,2,4,1};
        long N=5;
        System.out.println(inversionCount(arr,N));
    }
    static long inversionCount(long arr[], long N)
    {
        long [] temp=new long[arr.length];
        return mergeSort(arr,temp,0,arr.length-1);
    }
    static long mergeSort(long[] arr,long[] temp,int l,int r){
        long inversion=0;
        if(l<r){
            int m=(l+r)/2;
            inversion+=mergeSort(arr,temp,l,m);
            inversion+=mergeSort(arr,temp,m+1,r);
            inversion+=merge(arr,temp,l,m+1,r);
        }
        return inversion;
    }
    static long merge(long []arr,long[] temp,int l,int m,int r){
        long ans=0;
        int i=l;
        int k=l;
        int j=m;
        while(i<=m-1 && j<=r){
            if(arr[i]<=arr[j]) temp[k++]=arr[i++];
            else{
                temp[k++]=arr[j++];
                ans+=ans+(m-i);
            }
        }
        while(i<=m-1) temp[k++]=arr[i++];
        while(j<=r) temp[k++]=arr[j++];

        for(i=l;i<=r;i++){
            arr[i]=temp[i];
        }
        return ans;
    }
}
