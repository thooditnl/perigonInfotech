package com.java.practise.thread;

/**
 * Created by THOODI on 2/20/2017.
 */
public class Current1 {
    public static void main(String[] args) {
        System.out.println("Let us find the current thread:");  //Let us find the current thread:
        Thread t = Thread.currentThread();
        System.out.println("current thread: "+ t);  //current thread: Thread[main,5,main]
        System.out.println("Thread Name: "+ t.getName());  //Thread Name: main
    }
}
// CurrentThread()-- It is a static method in Thread class.
// by default priority of the thread is 5. But it ranges from 1 to 10.
//[main -- indicates the name of the thread running  the current node]
//[5 -- priority of the thread]
//[main -- indicates the thread group name to which the thread belongs ]
//Thread group represents a group of threads as a single unit.