package com.java.practise.Generics;

import java.util.ArrayList;

/**
 * Created by THOODI on 2/24/2017.
 */
public class Non_Generic_Code {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("Kiran");
        l.add("ravi");
        // l.add(10);  exception
        m1(l);
        System.out.println(l);
       // l.add(10.5);  exception
    }

    public static void m1(ArrayList l){
        l.add(10);
        l.add(10.5);
        l.add(true);
    }
}
