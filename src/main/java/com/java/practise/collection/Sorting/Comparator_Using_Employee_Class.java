package com.java.practise.collection.Sorting;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by THOODI on 2/7/2017.
 */
public class Comparator_Using_Employee_Class {
    public static void main(String[] args) {
        Employee e1 = new Employee("nag",100);
        Employee e2 = new Employee("balaiah",200);
        Employee e3 = new Employee("chiru",50);
        Employee e4 = new Employee("venki",150);
        Employee e5 = new Employee("nag",100);

        TreeSet t = new TreeSet();  // based on Employee ID
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);

        System.out.println(t);  //  [chiru--50, nag--100, venki--150, balaiah--200]-- based on employee id

        TreeSet t1 = new TreeSet(new MyComparator12());  // based on alphabetical order.
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);

        System.out.println(t1);  //[balaiah--200, chiru--50, nag--100, venki--150]
    }
}


class Employee implements Comparable{

    String name;
    int eid;

    public Employee(String name, int eid) {
        this.name = name;
        this.eid = eid;
    }
 public String toString(){
        return name+"--"+ eid;
 }

 public int compareTo(Object obj){
     int eid1 = this.eid;
     Employee e = (Employee)obj;
     int eid2 = e.eid;
     if(eid1<eid2){
         return -1;  //before
     }
     else if(eid1 > eid2){
         return +1;  //after
     }
     else
         return 0;  //equals
 }
}

class MyComparator12 implements Comparator{


    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee)o1;
        Employee e2 = (Employee)o2;
        String s1 =e1.name;
        String s2 = e2.name;
        return s1.compareTo(s2);
    }
}