package com.java.practise.palindrom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by THOODI on 2/3/2017.
 */
public class Palindrom_String {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String: ");
        String str = br.readLine();
       boolean rev = reverseString(str);

    if(rev)
        System.out.println(rev + " is a palindrome");
    else
        System.out.println(rev + " is not a palindrome");
    }

    public static boolean reverseString(String str){
    String rev ="";
    for(int i=str.length()-1; i>=0;i--){
        rev=rev+str.charAt(i);
    }
    if(rev.equalsIgnoreCase(str))
return true;
 //   System.out.println(rev + " is a palindrome");
    else
    //System.out.println(rev + " is not a palindrome");
    return false;
}
}

//input as malayalam
//output --malayalam

/*
Using String Buffer
public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String: ");
        String str = br.readLine();
        String temp =str;
        StringBuffer sb = new StringBuffer(str).reverse();
       // sb.reverse();
        str = sb.toString();  //converts a stringbuffer into a string
    if(temp.equalsIgnoreCase(str))
        System.out.println(temp + " is a palindrome");
    else
        System.out.println(temp + " is not a palindrome");
    }*/