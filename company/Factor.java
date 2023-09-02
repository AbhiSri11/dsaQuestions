package com.company;

public class Factor {
    public static void main(String[] args) {
        main(36);
    }
    static void main(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                int ans =i;
                int ans2= n/i;
                if(n/i==i)
                    System.out.print(ans);
                else
                    System.out.print(ans+" "+ ans2+" ");
            }
        }
    }
}
