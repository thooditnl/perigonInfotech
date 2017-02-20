package com.java.practise.swapnumbers;


/**
 * Created by THOODI on 12/29/2016.
 */
public class Main {
    public static void main(String[] args) {
        Flight val1 = new Flight(10);
        Flight val2 = new Flight(20);
        swap(val1, val2);
        System.out.println("val1"+val1.toString()+"val2"+val2.toString());
    }
   static void swap(Flight i, Flight j){
        int k = i.getFlightnumber();
        i.setFlightnumber(j.getFlightnumber());
        j.setFlightnumber(k);
    }

}
