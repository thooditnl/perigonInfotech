package com.java.practise.stringsolutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by THOODI on 2/2/2017.
 */
public class String_Tokenizers_WhiteSpace_commas {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name, age, salary: ");
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str,",");

        String s1 = st.nextToken();
        String s2 = st.nextToken();
        String s3 = st.nextToken();

        s1 = s1.trim();  //removes the spaces before and after the tokens
        s2 = s2.trim();
        s3 = s3.trim();

        String name =s1;
        int a = Integer.parseInt(s2);
        float sal = Float.parseFloat(s3);

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + a);
        System.out.println("salary is: " + sal);
    }
}
