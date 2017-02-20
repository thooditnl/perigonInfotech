package com.java.practise.collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by THOODI on 2/7/2017.
 */


//Write a program to insert String and String Buffer objects into the Treeset where Sorting Order is INcreasing length order
// if two objects having the same lenth then consider their alphabetical order.


public class Comparator_IncreasingLength_SameLength_AlpabeticalOrder {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator34());
        t.add("A");
        t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("AA"));
        t.add("XX");
        t.add("ABCD");
        t.add("A");
        System.out.println(t);  //[A, AA, XX, ABC, ABCD]
    }
}

class MyComparator34 implements Comparator{

    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        int l1 =s1.length();
        int l2 =s2.length();
        if(l1 < l2 )
            return -1;
        else if(l1 > l2)
            return +1;
        else
            return s1.compareTo(s2);
    }
}