package com.java.practise.ParameterizedConstructor;

/**
 * Created by THOODI on 11/2/2016.
 */
public class Person {
    private String name;
    private int age;

    Person()
    {
        name ="Kiran";
        age=20;
    }

    Person(String i,int j){
        name =i;
        age=j;
    }
    void talk(){
        System.out.println("The name of the person is:"+ name);
        System.out.println("The age of the person is:"+ age);
    }
}

class Demo{
    public static void main(String[] args) {
        Person raju=new Person();
        raju.talk();
        Person sita =new Person("sita",10);
        sita.talk();
    }
}