package com.java.practise.collection.List.Vector;

import java.util.Vector;

/**
 * Created by THOODI on 2/6/2017.
 */
public class VectorDemo1 {
    public static void main(String[] args) {

        Vector v = new Vector();
      //  Vector v = new Vector(25);  Now it will print 25 all the times as capacity
       // Vector v = new Vector(10,5);  10 is default capacity and after that 5 is increamented.
        System.out.println(v.capacity()); // initially it is 10
        for(int i=1;i<=10;i++){
            v.addElement(i);
        }
        System.out.println(v.capacity());
        v.addElement("A");
        System.out.println(v.capacity()); //After adding 11th element it is 20.
        System.out.println(v);


    }
}


//New Capacity = 2* Old Capacity;