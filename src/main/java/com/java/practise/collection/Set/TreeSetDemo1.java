package com.java.practise.collection.Set;

import java.util.TreeSet;

/**
 * Created by THOODI on 2/7/2017.
 */
public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet t= new TreeSet();
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("L"));
        t.add(new StringBuffer("B"));
        System.out.println(t);  //java.lang.ClassCastException: java.lang.StringBuffer cannot be cast to java.lang.Comparable
    }
}
