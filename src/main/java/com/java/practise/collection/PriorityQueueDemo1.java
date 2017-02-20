package com.java.practise.collection;

import java.util.PriorityQueue;

/**
 * Created by THOODI on 2/11/2017.
 */
public class PriorityQueueDemo1 {
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();
        System.out.println(p.peek()); //null
       System.out.println(p.element()); //RE: NSEE  NoSuchElementException
        for (int i = 0; i <= 10; i++) {
            p.offer(i);
        }
        System.out.println(p); //[0,1,2,------10]
        System.out.println(p.poll()); //0
        System.out.println(p); //[1,2,3,.....9]
    }
}
