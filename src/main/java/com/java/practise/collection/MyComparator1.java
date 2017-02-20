package com.java.practise.collection;

import java.util.Comparator;

/**
 * Created by THOODI on 2/7/2017.
 */
public class MyComparator1 implements Comparator {


    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer)o1;
        Integer i2 = (Integer)o2;

       // return i1.compareTo(i2);  // prints in ascending order [0,10,15,20]
       // return -i1.compareTo(i2);  // prints in descending order [20,15,10,0]
        //return i2.compareTo(i1);// prints in descending order [20,15,10,0]
          return -i2.compareTo(i1);  // prints in ascending order [0,10,15,20]

        //return +1;  // [10,0,15,20,20]  insertion order

     //   return -1;  // [20,20,15,0,10]  reverse of insertion order

       // return 0 ; //  [10] only first element is inserted and all other elements are considered as duplicates


    }
}
