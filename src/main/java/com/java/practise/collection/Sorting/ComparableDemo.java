package com.java.practise.collection.Sorting;

/**
 * Created by THOODI on 2/7/2017.
 */
public class ComparableDemo {
    public static void main(String[] args) {
        System.out.println("A".compareTo("Z"));  //-25
        System.out.println("Z".compareTo("B"));  //24
        System.out.println("A".compareTo("A"));  //0
        System.out.println("A".compareTo("A"));  //0
        System.out.println("A".compareTo(null));  //Null Pointer Exception
    }
}
