package com.java.practise.thread;

import java.io.IOException;

/**
 * Created by THOODI on 2/20/2017.
 */
public class MyThread extends Thread {
//public class MyThread implements Runnable {
    boolean stop =false;
    public void run() {
        for (int i = 0; i <= 100000; i++) {
            System.out.println(i);
            if(stop) return;  //comes out of run
        }
    }
}
class DemoThread
{
    public static void main(String[] args) throws IOException {
        MyThread obj = new MyThread();
        Thread t = new Thread(obj);
        t.start();
        System.in.read();  //Stop the thread when enter key is presseds
        obj.stop = true;
    }
}
