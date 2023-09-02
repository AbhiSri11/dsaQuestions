package com.oops;
interface F{
    int a = 9;
    void show();
    void config();
}
abstract class G implements F{
    public void show() {
        System.out.println("in show");
    }
}
class H extends G{
    public void config() {
        System.out.println("in config");
    }
}
public class Interface {
    public static void main(String[] args) {
        F obj = new H();
        obj.show();
        obj.config();
        //System.out.println(F.a);
    }
}
