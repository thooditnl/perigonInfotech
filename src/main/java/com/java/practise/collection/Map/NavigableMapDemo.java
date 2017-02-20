package com.java.practise.collection.Map;

import java.util.TreeMap;

/**
 * Created by THOODI on 2/11/2017.
 */
public class NavigableMapDemo {
    public static void main(String[] args) {
        TreeMap<String,String> m = new TreeMap<String,String>();
        m.put("b","banana");
        m.put("c","cat");
        m.put("a","apple");
        m.put("d","dog");
        m.put("g","gun");
        System.out.println(m);  //{a=apple, b=banana, c=cat, d=dog, g=gun}
        System.out.println(m.ceilingKey("c"));  //c  >=e
        System.out.println(m.higherKey("e")); //g   >e
        System.out.println(m.floorKey("e"));// d    <=e
        System.out.println(m.lowerKey("e")); //d   <e
        System.out.println(m.pollFirstEntry()); //a=apple
        System.out.println(m.pollLastEntry()); //g=gun
        System.out.println(m.descendingMap()); //  {d=dog, c=cat, b=banana}
        System.out.println(m); //  {b=banana, c=cat, d=dog}
    }
}
