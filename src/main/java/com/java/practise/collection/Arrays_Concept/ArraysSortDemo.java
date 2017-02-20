package com.java.practise.collection.Arrays_Concept;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by THOODI on 2/11/2017.
 */
public class ArraysSortDemo {
    public static void main(String[] args) {
        int[] a = {10,5,20,11,6};
        System.out.println("primitive array before Sorting:");
        for(int a1:a){
            System.out.println(a1);  //10,5,20,11,6
        }
        Arrays.sort(a);
        System.out.println("primitive array After Sorting:");
        for(int a1:a){
            System.out.println(a1);  //5,6,10,11,20
        }
        Arrays.sort(a);
        String[] s = {"A","Z","B"};
        System.out.println("Object Array before Sorting");
        for(String s1:s){
            System.out.println(s1); //A,Z,B
        }
        Arrays.sort(s);
        System.out.println("Object Array After Sorting");
        for(String s2:s){
            System.out.println(s2);  //A,B,Z
        }
        Arrays.sort(s,new MyComparatorarrays());
        System.out.println("Object Array after Sorting using Comparator:");
        for(String a2:s){
            System.out.println(a2);  //Z,B,A
        }
    }
}

class MyComparatorarrays implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }
}