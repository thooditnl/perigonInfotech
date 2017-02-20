package com.java.practise.collection.Set;

import java.util.TreeSet;

/**
 * Created by THOODI on 2/7/2017.
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
    /*    t.add("A");
        t.add("a");
        t.add("B");
        t.add("Z");
        t.add("L");*/
       // t.add(new Integer(10)); //ClassCastException  -- Heterogeneous objects are not allowed.
        t.add(null);  //--Null Pointer Exception
        t.add("A");
        System.out.println(t); // [A, B, L, Z, a]
    }
}
