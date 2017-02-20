package com.java.practise.stringsolutions;

import java.util.Scanner;

/**
 * Created by THOODI on 2/2/2017.
 */
public class Print_New_String_with_Repetation_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        while ((s=sc.next())!=null){
            System.out.println(sortString(s));
        }
    }

    static String findRepeatCount(String s, char c, String finalString){
        int temp=0;
        for(int i=0;i<s.length();i++){
            if(String.valueOf(c).equalsIgnoreCase(String.valueOf(s.charAt(i)))){
                temp++;
            }
        }
        return finalString + String.valueOf(c)+ String.valueOf(temp);
    //initially finalString is 0 and String.valueof(c) is e and String.valueof(temp) is number.
    }

    static String sortString(String s){
    String finalString="";
    for(char temp='a';temp<='z';temp++){
        if(s.contains(String.valueOf(temp))){
            finalString = findRepeatCount(s,temp,finalString);
            //s is initially "hello" and temp is the character "e" and final string is empty initially and after increment it will add to the resultant string.
        }
    }
    return finalString;
    }
}

//Given input as Hello

//output is: e1h1l2o1