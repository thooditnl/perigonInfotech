package com.java.practise.collection;

import java.util.Stack;

/**
 * Created by THOODI on 2/6/2017.
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("A");
        s.push("B");
        s.push("c");
        System.out.println(s);   //[A, B, c]
        System.out.println(s.search("A"));   //Offset is 3. It comes from top to bottom
        System.out.println(s.search("Z"));  // It returns -1 if there is no value in it.
    }

}
