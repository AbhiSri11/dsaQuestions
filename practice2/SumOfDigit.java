package com.practice2;

public class SumOfDigit {
    //Digit Sum
    public static void main(String[] args) {
        System.out.println(sum(1308));
    }
    public static int sum(int digit){
        if(digit == 0) return 0;
        return digit%10 +sum(digit/10);
    }
    // Sorted Or Not
//    public static void main(String[] args) {
//        int[] arr = {2,4,7,8,6,7,8,9};
//        boolean flag = sorted(0,arr);
//        System.out.println(flag);
//    }
//    public static boolean sorted(int i,int[] arr){
//        if(i>=arr.length-1){
//            return true;
//        }
//        if(arr[i]> arr[i+1]){
//            System.out.println("fsla");
//            return false;
//        }
//
//        return sorted(i+1,arr);
//    }
}
