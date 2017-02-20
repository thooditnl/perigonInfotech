package com.java.practise.Abstract;
/**
 * Created by THOODI on 11/4/2016.
 */
abstract class Myclass {
    abstract void calculate(double x);
}

class Sub1 extends Myclass{
    void calculate(double x){
        System.out.println("The Square Value is :" + (x*x));
    }
}

class Sub2 extends Myclass{
    void calculate(double x){
        System.out.println("The Square root is :"+ Math.sqrt(x));
    }
}

class Sub3 extends Myclass{
    void calculate(double x){
        System.out.println("The cube is :"+ (x*x*x));
    }
}

class Different{
    public static void main(String[] args) {
        Sub1 s1 = new Sub1();
        Sub2 s2 = new Sub2();
        Sub3 s3 = new Sub3();
        s1.calculate(2);
        s2.calculate(3);
        s3.calculate(4);

        //In Abstract class, we can give reference variable to the Myclass. But we can't create object to the abstract class directly.
        Myclass ref;
        ref = s1;
        ref = s2;
        ref = s3;
        ref.calculate(3);
        ref.calculate(4);
        ref.calculate(5);

    }
}
