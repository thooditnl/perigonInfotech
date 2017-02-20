package com.java.practise.collection.Cursor;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by THOODI on 2/6/2017.
 */
public class EnumerationCrusorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        for(int i=0;i<=10;i++){
            v.addElement(i);
        }
        System.out.println(v);  //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        Enumeration e = v.elements();
        while (e.hasMoreElements()){
            Integer I = (Integer) e.nextElement();
            if(I%2==0)
                System.out.println(I); // [0,2,4,6,8,10]
        }
        System.out.println(v);  //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}
