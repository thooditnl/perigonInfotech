package com.java.practise.collection.Set;

import java.util.HashSet;

/**
 * Created by THOODI on 2/7/2017.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(10);
        System.out.println(h.add("Z"));  //false
        System.out.println(h);  //  [null, B, C, D, Z, 10]
    }
}
