package com.java.practise.primenumber;

/**
 * Created by THOODI on 1/16/2017.
 */
public class Prime_Number {
    public static void main(String[] args) {
        int m,i,flag=0;
        int n=15;
        m=n/2;
        for(i=2;i<=m;i++){
            if(n%i==0){
                System.out.println("Number is not a prime:");
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Number is prime:");
    }
}
// The best way to learn is first

//1. divide to get the quotient.
//2. modulous to get the remainder.


// Prime number is a number that is greater than 1 and divided by 1 or itself. In other words,
// prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
//Note: 0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers can be divided by 2.