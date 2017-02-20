package com.java.practise.Inheritance;

/**
 * Created by THOODI on 11/3/2016.
 */
class One {
    int i = 10;
    public void show() {
        System.out.println("The One SuperClass Output is:" + i);
    }
}

class Two extends One {
    int i = 20;
    public void show(){
        System.out.println("The  SubClass Output is:" + i);  //20
        super.show();  //10
        System.out.println("The  SuperClass Output is:" + super.i);  //10
    }
}

public class Super1 {
    public static void main(String[] args) {
        Two obj = new Two();
        obj.show();
    }
}
