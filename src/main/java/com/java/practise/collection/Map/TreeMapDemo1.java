package com.java.practise.collection.Map;

import java.util.TreeMap;

/**
 * Created by THOODI on 2/9/2017.
 */

//Default Natural of Sorting Order in TreeMap. This is 1st type of COnstructor.
public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap m = new TreeMap();
        m.put(100,"ZZZ");
        m.put(103,"YYY");
        m.put(101,"XXX");
        m.put(104,106);
        m.put("FFFF","XXX");  //CCE  --ClassCast Exception
        m.put(null,"XXX"); //NPE -- Null Pointer Exception
        System.out.println(m);  //{100=ZZZ, 101=XXX, 103=YYY, 104=106}
    }
}
