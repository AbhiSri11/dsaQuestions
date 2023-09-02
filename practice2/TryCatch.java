package com.practice2;

public class TryCatch {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int j=0;
        // isko confirm krna hai
//        if(j==0) throw new Exception();
        try{
            int p = arr[5];
            int a = 9/0;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Crossed Limit");
        }
        catch(Exception e){
            System.out.println("Divide by 0");
        }
        System.out.println("Oh! my God");
    }
}
