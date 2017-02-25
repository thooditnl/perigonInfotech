package com.java.practise.collection.Sorting;

import java.util.TreeSet;

/**
 * Created by THOODI on 2/7/2017.
 */
public class ComparatorDemo {
    public static void main(String[] args) {
       // TreeSet t = new TreeSet();
        TreeSet t = new TreeSet(new MyComparator());  // LINE-1 :: Integer objects in TreeSet, in descending order. by default it is in ascending order
        t.add(10);
        t.add(0);  //--+ve---- Compare(0,10);
        t.add(15);//-- -ve --- Compare(15,10);
        t.add(20); //--- +ve -- Compare (20,10);
        t.add(20); //--- -ve -- Compare(20,15);

        t.add(20); //--- +ve -----Compare(20,10);
        t.add(20); //--  -ve ---Compare(20,15);
        t.add(20); // --- 0 ---Compare(20,20);

       // System.out.println(t1); //  [0, 10, 15, 20]
        System.out.println(t);  //   [20, 15, 10, 0]
    }
}

