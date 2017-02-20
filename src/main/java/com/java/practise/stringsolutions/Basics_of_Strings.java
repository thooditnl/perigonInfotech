package com.java.practise.stringsolutions;

/**
 * Created by THOODI on 2/2/2017.
 */
public class Basics_of_Strings {
    public static void main(String[] args) {
        String s = "Java";
        //s is a variable of string data type.
        System.out.println(s);

        String s1 = new String ("Welcome");
        System.out.println(s1);
        //new operator creates the new memory location to store the variable and obj:s1 is reference to this object.

        char ch[] = {'c','h','a','i','r','s'};
        String s3 = new String(ch);
        System.out.println(s3);

        String s4 = new String(ch,2,3); //air
        System.out.println(s4);  //It will print 3 characters
        String s5 = new String(ch,2,1);
        System.out.println(s5);  //a
    }
}
