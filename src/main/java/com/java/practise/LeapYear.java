package com.java.practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by THOODI on 2/2/2017.
 */
public class LeapYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Year: ");
        String str = br.readLine();
        int year = Integer.parseInt(str);
        //if it is a century year and divisible by 400
        if(year % 100==0 && year % 400==0)   //checking for  (%)remainder value
            System.out.println("It is leap:");
        //if it is not a century year and divisible by 4
        else if(year %100 !=0 && year % 4==0)
            System.out.println("It is leap:");
        else
            System.out.println("It is not leap:");
    }
}
