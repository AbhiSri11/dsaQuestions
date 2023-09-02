package com.leetcode4;

public class Q400 {
    public static void main(String[] args) {
        int n = 1000000000;
        System.out.println(findNthDigit(n));
    }
    static int findNthDigit(int n) {
        int i = 0;
        while (n > 0) {
            int sum = 9 * (int) Math.pow(10, i) * (i + 1);
            if (n - sum == 0) return 9;
            if (n - sum < 0) break;
            n = n - sum;
            i++;
            if(2*sum>n) break;
        }
        int ans = (int) Math.pow(10, i);
        while (n > 0) {
            if (n - (i + 1) <= 0) break;
            n = n - (i + 1);
            ans++;
        }
        int digit = 0;
        int num = ans;
        while (num > 0) {
            num = num / 10;
            digit++;
        }
        //if(digit == 1) return ans;
        while (n > 0) {
            int p = ans;
            n -= 1;
            digit--;
            int z = p / (int) Math.pow(10, digit);
            if (n == 0) return z;
            ans = ans % (int) Math.pow(10, digit);
            if (ans == 0) return 0;
        }
        return ans;
    }
}
