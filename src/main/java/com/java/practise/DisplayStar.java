package com.java.practise;

/**
 * Created by THOODI on 10/16/2016.
 */
public class DisplayStar {
    public static void main(String[] args) {
        int i,j,k;      //i=row, j=space; k= star printing
        for(i=1; i<=5;i++)
        {
            for(j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for (k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
