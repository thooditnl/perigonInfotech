package com.java.practise;

/**
 * Created by THOODI on 11/1/2016.
 */
public class SuperKeyword {
    int num=20;
    public void display(){
        System.out.println("This is the method of superclass:");
    }
}

class Sub_class extends SuperKeyword{
    int num=10;
    public void display(){
        System.out.println("This is the method of Sub_class:");
    }
public void my_method(){
    Sub_class sub = new Sub_class();
    sub.display();
    super.display();
    System.out.println("This is the method of Sub_class:"+ sub.num);
    System.out.println("This is the method of Superclass:"+ super.num);
}
    public static void main(String[] args) {
        Sub_class obj = new Sub_class();
        obj.my_method();
    }
}
