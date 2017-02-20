package com.java.practise.inputreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by THOODI on 2/2/2017.
 */
public class Accepting_CharactersorString_From_KeyBoard_Using_BufferReader {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      /*  System.out.println("Enter a character :");  //a
        char c = (char) br.read();
        System.out.println("you entered  :"+ c); */ //First program , It will read only 1 character.

       /* System.out.println("Enter a String :");  // Hello , I am fine
        String  c1 = br.readLine();
        System.out.println("you entered  :"+ c1);*/ //Second program, It will read a group of characters also known as Strings.

        System.out.println("Enter an int value :");  // 25
        String  c2 = br.readLine();
        int i = Integer.parseInt(c2);
        System.out.println("you entered  :"+ i); //Third program, It will take the value as string and convert into integer using wrapper class.


    }
}
