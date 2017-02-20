package com.java.practise;

/**
 * Created by THOODI on 11/1/2016.
 */
public class SuperParameterizedConstructor {
    int age;
    SuperParameterizedConstructor(int age)
    {
        this.age=age;
    }
public void getAge(){
    System.out.println("The value of the variable named age in super class is: " +age);
}
}

class Subclass extends SuperParameterizedConstructor{

    Subclass(int age) {
        super(age);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(25);
        obj.getAge();
    }
}