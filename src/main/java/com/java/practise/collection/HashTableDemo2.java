package com.java.practise.collection;

import java.util.Hashtable;

/**
 * Created by THOODI on 2/10/2017.
 */
public class HashTableDemo2 {

    public static void main(String[] args) {
        Hashtable h = new Hashtable(25);
        h.put(new Temp3(5),"A");
        h.put(new Temp3(2),"B");
        h.put(new Temp3(6),"C");
        h.put(new Temp3(15),"D");
        h.put(new Temp3(23),"E");
        h.put(new Temp3(16),"F");
        // h.put("Durga", null);  //NPE
        System.out.println(h);  //{{23=E, 16=F, 15=D, 6=C, 5=A, 2=B}
        }
}

class Temp3{
    int i;
    Temp3(int i){
        this.i =i;
    }
    public int hashCode(){
        return i;
    }
    public String toString(){
        return i+"";
    }
}
