package com.java.practise.collection.Arrays_Concept;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.binarySearch;

/**
 * Created by THOODI on 2/11/2017.
 */
public class ArraysSearchDemo {
    public static void main(String[] args) {
        int[] a = {10,5,20,11,6};
        Arrays.sort(a);
        System.out.println(binarySearch(a, 6));//1
        System.out.println(binarySearch(a, 14)); //-5

        String[] s = {"A","Z","B"};
        Arrays.sort(s);
        System.out.println(binarySearch(s,"Z"));//2
        System.out.println(binarySearch(s,"S")); //-3

        Arrays.sort(s,new MyComparatorarra());
        System.out.println(binarySearch(s,"Z",new MyComparatorarra())); //0
        System.out.println(binarySearch(s,"S",new MyComparatorarra())); //-2
        System.out.println(binarySearch(s,"Z")); //unpredictable result  -4

    }
}

class MyComparatorarra implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
    return s2.compareTo(s1);
    }
}
