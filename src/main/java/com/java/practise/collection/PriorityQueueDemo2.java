package com.java.practise.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by THOODI on 2/11/2017.
 */
public class PriorityQueueDemo2 {
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue(27,new MyComparatora());
        p.offer("A");
        p.offer("Z");
        p.offer("L");
        p.offer("B");
        System.out.println(p); // [Z, B, L, A]
    }
}

class MyComparatora implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }
}
