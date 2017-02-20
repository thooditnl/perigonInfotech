package com.java.practise.palindrom;

/**
 * Created by THOODI on 1/16/2017.
 */
public class Palindrom_Number {
    public static void main(String[] args) {
        int r, sum=0, temp;
        int n=454;

        temp =n;
        while(n>0){
            r = n%10;   //It will give you the remainder
            sum = (sum*10)+r;
            n = n/10;   // It will give you the quotitent.
        }

        if(temp==sum){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not a palindrome number");

        }

    }
}
// The best way to learn is first
// 1. modulous to get the remainder.
//2. divide to get the quotient.