package com.java.practise.collection.LinkedList;

import java.util.LinkedList;

/**
 * Created by THOODI on 2/6/2017.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Hello");
        l.add(30);
        l.add(null);
        l.add("Hello");
        System.out.println(l);  //[Hello, 30, null, Hello]
        l.set(0,"Software");
        System.out.println(l);  //[Software, 30, null, Hello]
        l.add(0,"Venke");
        l.removeLast();
        l.addFirst("ccc");
        System.out.println(l); //[ccc, Venke, Software, 30, null]
    }
}
