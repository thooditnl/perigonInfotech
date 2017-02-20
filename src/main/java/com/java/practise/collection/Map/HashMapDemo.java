package com.java.practise.collection.Map;

import java.util.*;

/**
 * Created by THOODI on 2/7/2017.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("chi",700);
        m.put("bal",800);
        m.put("ven",200);
        m.put("nag",500);
        System.out.println(m); //{chi=700, nag=500, bal=800, ven=200} . Map represents in Symbol {}, Where set []
        System.out.println(m.put("chi",1000));

        Set s = m.keySet();
        System.out.println(s); //[chi, nag, bal, ven]

        Collection c = m.values();
        System.out.println(c);  //  [1000, 500, 800, 200]

        Set s1 = m.entrySet();  //It will gives you the entrySet nothing but both key and values
        System.out.println(s1); //[chi=1000, nag=500, bal=800, ven=200]

        Iterator itr = s1.iterator();

        while(itr.hasNext()){  // After iteration of each s1
            Map.Entry m1 = (Map.Entry)itr.next();  //Since Entry need to be happen within the map, it is called as map.entry.
            System.out.println(m1.getKey()+"---"+m1.getValue());
            if(m1.getKey().equals("nag")){
                m1.setValue(1000);
            }
        }
        System.out.println(m); // {chi=1000, nag=1000, bal=800, ven=200}


    }
}
