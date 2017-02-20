package com.java.practise.AccessSpecifiers;

/**
 * Created by THOODI on 11/5/2016.
 */
public class Bs extends As {
    public static void main(String[] args) {
        As obj = new As();
      //  System.out.println(obj.a); // IT is not accessible from As. Since it is declared as Private Member.
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);


    }
}
