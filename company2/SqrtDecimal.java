package com.company2;
public class SqrtDecimal {
    public static void main(String[] args) {
       double ans = fun(40);
        System.out.println(ans);
    }
    static double fun(int n){
        int start =0;
        int end = n;
        int mid=0;
        double ans=0;int p=3;
        while(start<=end){
            mid = start + (end-start)/2;
            if(mid*mid==n) {
                ans = mid;
                start=end+1;
                return ans;
            }
            else if(mid*mid<n) {
                start = mid + 1;
                ans=mid;
            }
            else
                end = mid-1;
        }
        double imcre = 0.1;
        for(int i=0;i<3;i++){
            while(ans*ans<40){
                if(ans*ans==40)
                    return ans;
                else
                    ans=ans+imcre;
        }
            imcre=imcre/10;
        }
        return ans;
    }
}
