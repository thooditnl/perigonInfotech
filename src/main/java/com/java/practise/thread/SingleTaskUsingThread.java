package com.java.practise.thread;

/**
 * Created by THOODI on 2/20/2017.
 */
public class SingleTaskUsingThread implements Runnable {
    public void run(){
        task1();
        task2();
        task3();
    }
    void task1(){
        System.out.println("Executing task1");
    }
    void task2(){
        System.out.println("Executing task2");
    }
    void task3(){
        System.out.println("Executing task3");
    }
}
class DemoSingle{
    public static void main(String[] args) {
        SingleTaskUsingThread s = new SingleTaskUsingThread();
        Thread t = new Thread(s);
        t.run();
    }
}