package com.java.practise.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;

/**
 * Created by THOODI on 2/8/2017.
 */
public class IdentityHashMapDemo {
    public static void main(String[] args) {

       IdentityHashMap m = new IdentityHashMap();
       Integer i1 = new Integer(10);
       Integer i2 = new Integer(10);
       m.put(i1,"kiran");
       m.put(i2,"kishore");
       System.out.println(m); //{10=kiran, 10=kishore}. Map represents in Symbol {}, Where set []


        HashMap m1 = new HashMap();
        Integer i11 = new Integer(10);
        Integer i22 = new Integer(10);
        m1.put(i11,"kiran");
        m1.put(i22,"kishore");
        System.out.println(m1); //. {10=kishore} Map represents in Symbol {}, Where set []




    }
}
//IdentityHashMap uses == operator for comparision.
//HashMap uses .equals operator for comparision.