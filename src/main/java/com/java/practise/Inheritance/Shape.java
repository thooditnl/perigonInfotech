package com.java.practise.Inheritance;

/**
 * Created by THOODI on 11/3/2016.
 */
public class Shape {
    protected double l;
    Shape(double l){
        this.l=l;
    }
}

class Square extends Shape{
 Square(double l){
     super(l);
 }
 void area(){
     System.out.println("The area of Square is:" + (l*l));
 }
}

class Rectange extends Shape{
    private  double b;
    Rectange(double x, double y){
        super(x);
        b=y;
    }
    void area(){
        System.out.println("The area of Rectangle  is:" + (l*b));
    }
}

class Inherit{
    public static void main(String[] args) {
        Square s =new Square(10);
        Rectange r = new Rectange(10,20);
        s.area();
        r.area();
    }
}