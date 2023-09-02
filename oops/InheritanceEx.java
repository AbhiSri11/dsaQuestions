package com.oops;
class Bigo{
    int l;
    Bigo(int l){
        this.l = l;
    }
}
class All extends Bigo{
    int p=0;
//    void printing() {
//        System.out.print(l);
//    }
    All(int l, int p){
        super(l);
        this.p = p;
    }
}
public class InheritanceEx {
    public static void main(String[] args) {
        All obj = new All(3,5);
        //obj.printing();
        System.out.println(obj.l);
        System.out.println(obj.p);
    }
}
