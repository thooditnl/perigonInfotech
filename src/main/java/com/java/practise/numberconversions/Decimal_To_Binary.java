package com.java.practise.numberconversions;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by THOODI on 2/2/2017.
 */
public class Decimal_To_Binary {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int s;
        while ((s=sc.nextInt())!=0){
            String test=Integer.toBinaryString(s);
            System.out.println(test);
            break;
         }
    }
}



//given input as 2
//output 10

//give input as 10
//output 1010

//67
//1000011