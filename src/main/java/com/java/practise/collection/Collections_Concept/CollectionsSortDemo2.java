package com.java.practise.collection.Collections_Concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by THOODI on 2/11/2017.
 */
public class CollectionsSortDemo2 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("N");
        //  l.add(new Integer(10)); //CCE
        // l.add(null); //NPE
        System.out.println("Before Sorting:" + l);  //[Z, A, K, N]
        Collections.sort(l,new MyComparatorcoll());
        System.out.println("After Sorting:" + l); //[Z, N, K, A]
    }
}

class MyComparatorcoll implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
       return s2.compareTo(s1);
    }
}