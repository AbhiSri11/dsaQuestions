package com.oops;

@FunctionalInterface
interface I{
    int fun(int i, int j);
}
public class LembdaExpression {
    public static void main(String[] args) {
        I obj = (i,j) -> {
            return i+j;
        };
        int p = obj.fun(4,5);
        System.out.println(p);
    }
}
