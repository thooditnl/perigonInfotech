package com.java.practise.fibonaciseries;

/**
 * Created by THOODI on 2/13/2017.
 */
public class Fibonaci_Numbers {
    public static void main(String[] args) {

        int n1=0,n2=1,n3,count =10;;

        System.out.println(n1+""+n2);  // here it will print 0 and 1

        for(int i=2;i<count;i++){
            n3 = n1+n2;
            System.out.print(" "+ n3);  // it will print the add of previous 2 numbers
            n1=n2;
            n2=n3;
        }
    }
}
