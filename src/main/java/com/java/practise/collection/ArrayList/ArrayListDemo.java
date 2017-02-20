package com.java.practise.collection.ArrayList;

import java.util.ArrayList;

/**
 * Created by THOODI on 2/6/2017.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("A");
        l.add(10);
        l.add("A");
        l.add(null);
        System.out.println(l); //[A,10,A,null]
        l.remove(2);
        System.out.println(l); //[A,10,null]
        l.add(2,"M");
        l.add("N");
        System.out.println(l); //[A,10,M,null,N]
    }
}


//print object array reference internally call ".tostring" method. That's why we are getting braces as an array display.
//[A, 10, A, null]