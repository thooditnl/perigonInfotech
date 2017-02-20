package com.java.practise.collection.Map;

import java.util.Hashtable;

/**
 * Created by THOODI on 2/10/2017.
 */
public class HashTableDemo1 {
    public static void main(String[] args) {
        Hashtable h = new Hashtable();
        h.put(new Temp1(5),"A");
        h.put(new Temp1(2),"B");
        h.put(new Temp1(6),"C");
        h.put(new Temp1(15),"D");
        h.put(new Temp1(23),"E");
        h.put(new Temp1(16),"F");
       // h.put("Durga", null);  //NPE
        System.out.println(h);  //{6=C, 16=F, 5=A, 15=D, 2=B, 23=E}
    }
}

class Temp1{
    int i;
    Temp1(int i){
        this.i =i;
    }
public int hashCode(){
        return i;
    }
public String toString(){
    return i+"";
    }
}