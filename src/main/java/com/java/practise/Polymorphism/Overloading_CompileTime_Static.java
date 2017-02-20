package com.java.practise.Polymorphism;

/**
 * Created by THOODI on 11/3/2016.
 */
public class Overloading_CompileTime_Static {
    void sum(int a, int b){
        System.out.println("The addition of two numbers are:"+ (a+b));
    }
    void sum(int a, int b, int c){
        System.out.println("The addition of Three numbers are:"+(a+b+c));
    }
}

class PolyDemo{
    public static void main(String[] args) {
        Overloading_CompileTime_Static s = new Overloading_CompileTime_Static();
        s.sum(10,20);
        s.sum(10,20,30);
    }
}



