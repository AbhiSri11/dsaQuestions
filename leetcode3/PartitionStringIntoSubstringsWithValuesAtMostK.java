package com.leetcode3;

public class PartitionStringIntoSubstringsWithValuesAtMostK {
    public static void main(String[] args) {
        String s = "2615734525716398886811784627472176121257959984928149832342693395682233395978345297";
        System.out.println(s.length());
        int k = 784955370;
        System.out.println(minimumPartition(s,k));
    }
    static int minimumPartition(String s, int k) {
        if(s.length()<10 && k>Long.parseLong(s)){
            return 1;
        }
        if(k==9){
            return s.length();
        }
        if(k<9){
            int i=0;
            while(i<s.length()){
                if(k<(int)s.charAt(i)-'0'){
                    //System.out.println((int)s.charAt(i)-'0');
                    return -1;
                }
                i++;
            }
            return s.length();
        }
        long count =0;
        int i=0;
        int ans = 0;
        while(i<s.length()){
            count = count*10 + (int)s.charAt(i)-'0';
            if(count<=k){
                i++;
            }
            else{
                count = 0;
                ans++;
            }
        }
        return ans+1;
    }
}
