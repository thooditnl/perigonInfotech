package com.java.practise.collection.Sorting;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by THOODI on 2/7/2017.
 */
public class TreeSet_Strings_Comparator {
    public static void main(String[] args) {
       // TreeSet t = new TreeSet();
        TreeSet t = new TreeSet(new MyComparator9());
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("K"));
        t.add(new StringBuffer("L"));
        System.out.println(t);   //[A, K, L, Z]
       // System.out.println(t);  //ClassCastException
    }
}

class MyComparator9 implements Comparator{

    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s1.compareTo(s2);
    }
}

