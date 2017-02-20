package com.java.practise.Polymorphism;
/**
 * Created by THOODI on 11/4/2016.
 */
class Ones {
     void calculate(double x){
        System.out.println("The Square Value is:"+ x*x);
    }
}

class Twos extends Ones{
     void calculate(double x){
        System.out.println("The Square Root is:"+ Math.sqrt(x));
    }
}

class Polys{
    public static void main(String[] args) {
        Ones os = new Twos();
        Twos tw = new Twos();
        os.calculate(25);
        tw.calculate(50);
    }
}
