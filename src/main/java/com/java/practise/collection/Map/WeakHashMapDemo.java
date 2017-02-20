package com.java.practise.collection.Map;

import java.util.WeakHashMap;

/**
 * Created by THOODI on 2/8/2017.
 */
public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        WeakHashMap m = new WeakHashMap();
        Temp t = new Temp();
        m.put(t,"durga");
        System.out.println(m);   //  {temp=durga}
        t=null;
        System.gc();   //  Finalized method called:
        Thread.sleep(5000);
        System.out.println(m);   //{}
/*
        HashMap m = new HashMap();
        Temp t = new Temp();
        m.put(t,"durga");
        System.out.println(m);   //  {temp=durga}
        t=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(m);   //{temp=durga}
*/
    }
}

class Temp{
    public String toString(){
        return "temp";
    }
    public void finalize(){  // it is called when we use WeakHashMap, Where as Hashmap it won't call this method.
        System.out.println("Finalized method called:");
    }
}
