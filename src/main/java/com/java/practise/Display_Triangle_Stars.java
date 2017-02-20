package com.java.practise;

/**
 * Created by THOODI on 2/2/2017.
 */
public class Display_Triangle_Stars {
    public static void main(String[] args) {
        int r =5;  //we want 5 rows
        for(int i=1;i<=r;i++){
            for(int st=1;st<=i;st++) { //st represents no.of stars
                      System.out.print("*");
            }
            System.out.println();
        }
    }
}

