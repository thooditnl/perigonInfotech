package com.java.practise.collection.Set;

import java.util.LinkedHashSet;

/**
 * Created by THOODI on 2/7/2017.
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet h = new LinkedHashSet();
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(10);
        System.out.println(h.add("Z"));  //false
        System.out.println(h);  //  [B, C, D, Z, null, 10]
    }
}
