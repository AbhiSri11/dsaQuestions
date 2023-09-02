package com.RecursionByStriver;

public class SumOfFirstNumber {
         //    1st Method

//    public static void main(String[] args) {
//        int n=5;
//        Sum(1,5);
//    }
//    static int s = 0;
//    static void Sum(int i,int n){
//        if(i>n){
//            System.out.println(s);
//            return;
//        }
//        s=s+i;
//        Sum(++i,n);
//    }

         //     2nd Method

//      public static void main(String[] args) {
//          int n=5;
//          int sum=0;
//          Sum(1,n,sum);
//      }
//      static void Sum(int i,int n,int sum){
//          if(i>n) {
//              System.out.println(sum);
//              return;
//          }
//          sum=sum+i;
//          Sum(++i,n,sum);
//      }

          //     3rd Method

    public static void main(String[] args) {
        int n=5;
        int p = Sum(n);
        System.out.println(p);
    }
    static int Sum(int n){
        if(n==0)
            return 0;
        return n+Sum(n-1);
    }
}
