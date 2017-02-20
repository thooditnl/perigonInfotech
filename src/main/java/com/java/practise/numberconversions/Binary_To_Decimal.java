package com.java.practise.numberconversions;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by THOODI on 2/2/2017.
 */
public class Binary_To_Decimal {
    public static void  main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int s;
        while ((s = sc.nextInt()) != 0) {
            System.out.println("The Binary value :" + s + " is equal to Decimal Value: " + bToD(s));
            break;
        }
    }

    public static int bToD(int s){
        int decimal=0;
        int power = 0;
        while (s!=0){
        int lastDigit = s % 10;
        decimal += lastDigit * Math.pow(2, power);
        power++;
        s = s / 10;
    }
        return decimal;
    }
}

//10
//2

//1010
//10