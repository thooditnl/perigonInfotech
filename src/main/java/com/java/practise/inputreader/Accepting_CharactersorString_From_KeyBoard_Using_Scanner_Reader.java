package com.java.practise.inputreader;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by THOODI on 2/2/2017.
 */
public class Accepting_CharactersorString_From_KeyBoard_Using_Scanner_Reader {
    public static void main(String[] args) throws IOException {

        Scanner br = new Scanner((System.in));
   /*   System.out.println("Enter a character :");  //a
        String c = br.next();
        System.out.println("you entered  :"+ c);  //First program , It will read only 1 character.*/

  /*    System.out.println("Enter a String :");  // Hello , I am fine
        String  c1 = br.next();
        System.out.println("you entered  :"+ c1); //Second program, It will read a group of characters also known as Strings.

   */   System.out.println("Enter an int value :");  // 25
        int i = br.nextInt();
        System.out.println("you entered  :"+ i); //Third program, It will take the value as string and convert into integer using wrapper class.
    }
}
