package com.java.practise.AccessSpecifiers.AccessSpecifierAnotherPackage;


import com.java.practise.AccessSpecifiers.As;

/**
 * Created by THOODI on 11/5/2016.
 */
public class Cs extends As {
    public static void main(String[] args) {
        As obj = new As();
      //  System.out.println(obj.a); // IT is not accessible from As. Since it is declared as Private Member.
        System.out.println(obj.b);  //public available
       // System.out.println(obj.c);//protected not available
       // System.out.println(obj.d); //default not available.
    }
}

// For Protected Example: Where public and Protected is available to Cs from As using Inheritance Concept.
/*
public class Cs extends As {
    public static void main(String[] args) {
        Cs obj = new Cs();
        System.out.println(obj.a); // IT is not accessible from As. Since it is declared as Private Member.
        System.out.println(obj.b);  //public available
        System.out.println(obj.c);//protected not available
        System.out.println(obj.d); //default not available.
    }
}
*/
