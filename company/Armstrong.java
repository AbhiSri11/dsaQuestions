package com.company;

public class Armstrong {
    public static void main(String[] args) {
      int r=main(153);
      if(r==1)
          System.out.println("armstrong");
      else
          System.out.println("not");
    }
    static int main(int num)
    {
        int count=0;
        int num2=num;
        int num3=num;
        int rem,sum=0;
        while(num3!=0)
        {
            rem =num3%10;
            num3 /= 10;
            count++;
        }
        while(num2!=0)
        {
            rem=num2%10;
            sum= sum + (int) (Math.pow((double)rem,(double)count));
            num2=num2/10;
            //System.out.println(sum);

        }
        System.out.println(sum);
        if(sum==num)
            return 1;
        else
            return 0;
    }
}
