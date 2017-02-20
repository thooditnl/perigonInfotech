package com.java.practise;

/**
 * Created by THOODI on 2/13/2017.
 */
public class Varargs_Example1 {
    int s;

    public Varargs_Example1(int s) {
        this.s = s;
    }

    static void display(int xx, String... values){
        for(String x:values)
        System.out.println("display method invoked "+ x);
    }

    public static void main(String args[]){
    Varargs_Example1 vax = null; //0
    System.out.println(vax.s);
      //  display();//zero argument
        display(0,"my","name","is","varargs");//four arguments
    }
}
// We can pass multipe parameters but Var_args values should be the last value