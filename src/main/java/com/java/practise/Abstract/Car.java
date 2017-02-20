package com.java.practise.Abstract;

/**
 * Created by THOODI on 11/5/2016.
 */
abstract public class Car {
    int regno;
    Car(int r) {
        regno = r;
    }
    void openTank() {
        System.out.println("Fill the Tank");
    }
    abstract void steering(int direction, int angle);
    abstract void braking(int force);
}

class Maruti extends Car{
    Maruti(int regno){
        super(regno);
    }
    void steering(int direction, int angle){
        System.out.println("Take a Turn");
        System.out.println("This is ordinary Steering");
    }
    void braking(int force){
        System.out.println("Brakes applied");
        System.out.println("These are hydraulic brakes");
    }
}

class Santro extends Car{
    Santro(int regno){
        super(regno);
    }
    void steering(int direction, int angle){
        System.out.println("Take a Turn");
        System.out.println("This is ordinary Steering");
    }
    void braking(int force){
        System.out.println("Brakes applied");
        System.out.println("These are hydraulic brakes");
    }
}

class UseCar{
public static void main(String[]args){
        Maruti m = new Maruti(1001);
       // Santro s = new Santro(1002);
    Car ref;
    ref=m;
    m.openTank();
    m.steering(1,90);
    m.braking(10);
        }
}
