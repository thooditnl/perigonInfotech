package com.java.practise.Polymorphism;

/**
 * Created by THOODI on 11/4/2016.
 */
class Commercial {
    private String name;

    void setName(String name){
        this.name =name;
    }
    String getName(){
        return name ;
    }
    void calculateBills(int units){
        System.out.println("Customer:" + getName());
        System.out.println("Bill amount:" + units*5.00);
    }
}

class Domestic extends Commercial{
    void calculateBills(int units){
        System.out.println("Customer:" + getName());
        System.out.println("Bill amount:" + units*2.50);
    }
}

class ElectricityBill{
    public static void main(String[] args) {
        Commercial co = new Commercial();
        co.setName("KIRAN");
        co.calculateBills(100);
        Domestic d = new Domestic();
        d.setName("RR");
        d.calculateBills(100);
    }
}

