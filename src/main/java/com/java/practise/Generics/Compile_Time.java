package com.java.practise.Generics;

import java.util.ArrayList;

/**
 * Created by THOODI on 2/24/2017.
 */
public class Compile_Time {
    public static void main(String[] args) {
        ArrayList l = new ArrayList<String>();
        l.add(10);
        l.add(10.5);
        l.add(true);
        System.out.println(l);
    }
}
