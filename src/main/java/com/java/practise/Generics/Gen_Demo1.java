package com.java.practise.Generics;

/**
 * Created by THOODI on 2/24/2017.
 */

class Gen<T>{
     T ob;

    public Gen(T ob) {
        this.ob = ob;
    }
    public void show(){
        System.out.println("The type of ob is: "+ ob.getClass().getName());
    }

    public T getOb() {
        return ob;
    }
}
public class Gen_Demo1 {
    public static void main(String[] args) {
        Gen<String> g1 = new Gen<String>("kiran");
        g1.show();
        System.out.println(g1.getOb());

        Gen<Integer> g2 = new Gen<Integer>(10);
        g2.show();
        System.out.println(g2.getOb());

        Gen<Double> g3 = new Gen<Double>(10.05);
        g3.show();
        System.out.println(g3.getOb());
    }
}
