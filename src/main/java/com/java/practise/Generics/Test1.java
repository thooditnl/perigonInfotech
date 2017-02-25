package com.java.practise.Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by THOODI on 2/24/2017.
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        List<String> lq = new ArrayList<String>();
        Collection<String> lc = new ArrayList<String>();
    //    Collection<Object> lo = new ArrayList<String>();  incompatible type.
     //   ArrayList<int> l = new ArrayList<int>();


    }
}


// List is an interface where AL,LL,Stack, Vector can be impelemented from list.
//This is b'se of dynamic polymorphism. Parent can refer to child.