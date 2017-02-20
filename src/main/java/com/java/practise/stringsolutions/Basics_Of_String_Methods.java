package com.java.practise.stringsolutions;

/**
 * Created by THOODI on 2/2/2017.
 */
public class Basics_Of_String_Methods {
    public static void main(String[] args) {
        String s1= "A book on Java";
        String s2= new String("I like it");
        char arr[] = {'D','r','e','m','t','e','c','h',',','p','r','e','s','s'};
        String s3 = new String(arr);
        // Above 3 are string type declarations.

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("The length of the first String: "+ s1.length());
        //Length
        System.out.println("Concat s1 to s2 :" + s1.concat(s2));
        //concat
        System.out.println(s1 + "From" + s3);
        //concat
        boolean x = s1.startsWith("A");
        System.out.println(x);

        String p = s2.substring(0,7);
        System.out.println(p);  //0th to 6th character it will print

        String q = s3.substring(0,9);
        System.out.println(q); //0th to 8th character it will print.

        System.out.println(p+q);

        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase().toString());

        String s6= "A book on Java";
        char arp[] = new char[20];
        s6.getChars(2,5,arp,0);
        System.out.println(arp); //boo


        String s[] = s6.split(" ");   //delimiter
        for(int i=0; i<s.length;i++){
            System.out.println(s[i]);
        }

        //Comparision--- Relational operators are not used for string comparsion.
        //If we perform, when an object is created by JVM, it returns the memory address of the object as a hexadecimal
        //number, Which is called Object Reference.
        //When a new object is created,a new reference number is allocated to it.
        //It means every object will have a unique reference.

        String a1 = "Hello";
        String a2 =  new String("Hello");
        if(a1==a2){
            System.out.println("both are same");
        }else{
            System.out.println("both are not same");
        }  //== operator compares the reference of the string objects.It does not compare the contents of the objects.


       if(a1.equals(a2)){
            System.out.println("both are  same");
        }else{
            System.out.println("both are not same");
        } // equals compare the content of the object.


    }
}
