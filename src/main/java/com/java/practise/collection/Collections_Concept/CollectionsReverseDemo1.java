package com.java.practise.collection.Collections_Concept;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by THOODI on 2/11/2017.
 */
public class CollectionsReverseDemo1 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(15);
        l.add(0);
        l.add(20);
        l.add(10);
        l.add(5);
        System.out.println(l);  //[15, 0, 20, 10, 5]
        Collections.reverse(l);
        System.out.println(l); //  [5, 10, 20, 0, 15]  .. It will reverse the order.
    }
}
