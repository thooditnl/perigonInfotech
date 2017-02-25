package com.java.practise.Generics;

import java.util.ArrayList;

/**
 * Created by THOODI on 2/24/2017.
 */
public class Generics_WildCards {
    public static void main(String[] args) {
        ArrayList<?> l = new ArrayList<String>();
        //ArrayList<? extends Number> l1 = new ArrayList<String>();    incompatible
        ArrayList<? extends Number> l2 = new ArrayList<Number>();
     //   ArrayList<?> l3 = new ArrayList<?>();     // invalid
        //   ArrayList<?> l4 = new ArrayList<? extends Number>();   //invalid



    }
}
