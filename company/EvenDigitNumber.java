package com.company;

public class EvenDigitNumber {
    public static void main(String[] args) {
        int [] arr ={12,345,2,6,7896,23,45};
        int ans = main(arr);
        System.out.println(ans);

    }
    static int main(int [] arr)
    { int c=0,j=0;
        for(int i=0;i<arr.length;i++){
//            c=0;
//           while(arr[i]!=0){
//                arr[i]=arr[i]/10;
//                c++;
            if(even(arr[i]))
                j++;
        }
        return j;
    }
    static boolean even(int num)
    {
        int c=0;
           while(num!=0) {
               num = num / 10;
               c++;
           }
           return c%2==0;

    }
}
