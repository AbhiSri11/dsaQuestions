package com.practice2;

public class PlayStation {
    public static void main(String[] args) {
        int[] arr = {123456,1234567};
        String[] str = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            str[i] = "";
            //first
            int len = (int) (Math.log10(arr[i]) + 1);
            if(len==6)str[i] = str[i]+"C";
            else str[i] = str[i]+"W";
            //second
            if(arr[i]==0) str[i] = str[i]+"Z";
            else if(arr[i]==1) str[i] = str[i]+"O";
            //third
            if(prime(arr[i])) str[i] = str[i]+"P";
            else str[i] = str[i]+"N";
            //fourth
            int z = digSum(arr[i]);
            str[i] = str[i] + z;
            //fifth
            if(arr[i]%2 == 0) {
                int p = arr[i]/2;
                str[i] = str[i]+p;
            }
            else{
                int p = (arr[i]-1)/2;
                str[i] = str[i]+p;
            }
        }
        for(int i=0;i<arr.length;i++) {
            System.out.println(str[i]);
        }
    }
    public static boolean prime(int n){
        int num = n;
        int i = 2;
        boolean flag = false;
        while (i <= num / 2) {
            // condition for nonprime number
            if (num % i == 0) {
                return false;
            }

            ++i;
        }
        return true;
    }
    public static int digSum(int n)
    {
        if (n == 0)
            return 0;
        return (n % 9 == 0) ? 9 : (n % 9);
    }
}
