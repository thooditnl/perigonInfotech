package com.java.practise.stringsolutions;

import java.util.Arrays;
import java.util.List;

/**
 * Created by THOODI on 2/12/2017.
 */
public class Arrays_asListDemo {
    public static void main(String[] args) {
        String s[] = {"A","Z","B"};
        List l = Arrays.asList(s);   // Converting Arrays to List
        System.out.println(l);  // [A, Z, B]
        s[0] = "K";
        System.out.println(l);  //  [K, Z, B]
        l.set(1,"L");
        for(String s1:s){
            System.out.println(s1); // K L B
        }
    //    l.add("durga");  //java.lang.UnsupportedOperationException
    //    l.remove(2);  //java.lang.UnsupportedOperationException
    //    l.set(1, new Integer(10)) ;  // java.lang.ArrayStoreException: java.lang.Integer

    }
}
