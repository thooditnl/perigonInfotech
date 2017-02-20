package com.java.practise.collection.Set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by THOODI on 2/7/2017.
 */
public class TreeSet_Strings_Reverse_Order {
    public static void main(String[] args) {
        TreeSet t1 =  new TreeSet();
        TreeSet t =  new TreeSet(new Mycomparator4());
        t.add("Roja");
        t.add("Shoba Rani");
        t.add("Raja Kumari");
        t.add("Ganga Bhavani");
        t.add("Ramulama");
        System.out.println(t1);  //[Ganga Bhavani, Raja Kumari, Ramulama, Roja, Shoba Rani]
        System.out.println(t);  //[Shoba Rani, Roja, Ramulama, Raja Kumari, Ganga Bhavani]
    }
}

class Mycomparator4 implements Comparator {

    public int compare(Object o1, Object o2) {
       String s1 = (String)o1;
       String s2 = o2.toString();  // Any way we can change it to strings.

       // return -s1.compareTo(s2);
        return s2.compareTo(s1);

    }
}

