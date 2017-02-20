package com.java.practise.thread;

/**
 * Created by THOODI on 2/20/2017.
 */
public class MultiTaskUsingMultipleThreads implements Runnable {
    String str;
    MultiTaskUsingMultipleThreads(String str){
        this.str = str;
    }
    public void run(){
    for(int i=0;i<=10;i++){
        System.out.println(str+ ":" +i);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    } //end of for
    } //end of run
}
class DemoMultiTasking{
    public static void main(String[] args) {
        MultiTaskUsingMultipleThreads m = new MultiTaskUsingMultipleThreads("Cut the ticket");
        MultiTaskUsingMultipleThreads s = new MultiTaskUsingMultipleThreads("show the seat");

        Thread t1 = new Thread(m);
        Thread t2 = new Thread(s);

        t1.start();
        t2.start();
    }
}
