package com.java.practise.stringsolutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by THOODI on 2/2/2017.
 */
public class Reverse_Words_Of_A_Sentence {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        //   Scanner sc = new Scanner(System.in);  //Scanner can't read the entire sentence while the Bufferreader can read the entire sentence.
        String s;
        while ((s=sc.readLine())!=null){
            //   while ((s=sc.next())!=null){
            System.out.println(reverseTheWords(s));
            break;
        }

    }

    static String reverseTheWords(String s){
        StringBuilder sb = new StringBuilder();
        String[] rev = s.split(" ");
        for(int i=rev.length-1;i>=0;i--){
          //  if(!rev[i].equals(" ")){
                sb.append(rev[i]).append(" ");
           //}
        }
        return sb.toString();
    }
}


/*
* Enter Hello World
* world hello
*
*
* */