package com.java.practise.stringsolutions;

/**
 * Created by THOODI on 2/12/2017.
 */
public class Appending_First_Char_Front_Back_String {
    public static void main(String[] args) {
        String result= practiseOnStrings("test");
        System.out.print(result);
    }
    public static String practiseOnStrings (String str)
    {
        if(str.length()<=3)
            return str.toUpperCase();
        int cut=str.length()-3;
        String front=str.substring(0,cut);
        String back=str.substring(cut);  // this takes from cut to the end
        return front+back.toUpperCase();
    }
}
