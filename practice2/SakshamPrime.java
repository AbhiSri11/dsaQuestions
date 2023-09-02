package com.practice2;

public class SakshamPrime {
    public static void main(String[] args) {
        int[] input1 = {-1,-2,-3,3,4,-7};
        int input2 = 6;
        System.out.println(add(input1,input2));
    }
    public static int add(int[] input1,int input2){
        int ans =0;
        if(input2>=1) ans+=input1[0];
        if(input2>=2) ans+=input1[1];
        for(int i=2;i<input2;i++){
            if(!isPrime(i)){
                ans = ans+input1[i];
            }
        }
        return ans;
    }
    public static boolean isPrime(int n)
    {
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
}
}
