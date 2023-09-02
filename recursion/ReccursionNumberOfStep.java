package com.recursion;

public class ReccursionNumberOfStep {
    public static void main(String[] args) {
        int ans = numberOfSteps(8);
        System.out.println(ans);
    }
//    static int c=0;
//    static int numberOfSteps(int num) {
//        if(num == 0){
//            return c;
//        }
//        if(num%2==0){
//            c++;
//            return numberOfSteps(num/2);
//        }
//        else {
//            c++;
//            return numberOfSteps(num -1);
//        }
//    }
       static int numberOfSteps(int num){
          return helper(num,0);
    }
    static int helper(int num, int c){
        if(num==0)
            return c;
        if(num%2==0)
            return helper(num/2,++c);
        else
            return helper(num-1,++c);
    }
}
