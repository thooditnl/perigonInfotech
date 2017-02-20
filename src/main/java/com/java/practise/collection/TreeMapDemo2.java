package com.java.practise.collection;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * Created by THOODI on 2/9/2017.
 */
public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap m = new TreeMap(new MyComparators());
        m.put("XXX",10);
        m.put("AAA",20);
        m.put("ZZZ",30);
        m.put("LLL",40);
        System.out.println(m);  //{ZZZ=30, XXX=10, LLL=40, AAA=20}
    }
}

class MyComparators implements Comparator {
    public int compare(Object o1, Object o2) {
        String obj1 = o1.toString();
        String obj2 = o2.toString();
        return  obj2.compareTo(obj1);
    }
}
