package com.java.practise.collection;

import java.util.LinkedHashMap;

/**
 * Created by THOODI on 2/8/2017.
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap m = new LinkedHashMap();
        m.put("chi",700);
        m.put("bal",800);
        m.put("ven",200);
        m.put("nag",500);
        System.out.println(m); //{chi=700, bal=800, ven=200, nag=500} . Map represents in Symbol {}, Where set [] .
        //In LinkedHashMap, insertion order is preserved.



    }
}
