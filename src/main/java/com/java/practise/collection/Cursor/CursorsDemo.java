package com.java.practise.collection.Cursor;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 * Created by THOODI on 2/7/2017.
 */
public class CursorsDemo {
    public static void main(String[] args) {
        Vector v = new Vector();

        Enumeration e = v.elements();
        Iterator itr = v.iterator();
        ListIterator litr = v.listIterator();

        System.out.println(e.getClass().getName());  // Ananymous inner class  java.util.Vector$1
        System.out.println(itr.getClass().getName()); // java.util.Vector$Itr
        System.out.println(litr.getClass().getName()); // java.util.Vector$ListItr


    }
}
