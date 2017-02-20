package com.java.practise.stringsolutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by THOODI on 2/3/2017.
 */
public class Basics_Of_StringBuffer {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Surname:");
        String surName = bufferedReader.readLine();
        System.out.println("Enter FirstName:");
        String firstName = bufferedReader.readLine();
        System.out.println("Enter LastName:");
        String lastName = bufferedReader.readLine();
        sb.append(surName).append(lastName);
        System.out.println("Name= "+ sb);
        int n =sb.length();
        sb.insert(n,firstName);
        System.out.println("full Name= "+ sb);
        System.out.println("In Reverse= " + sb.reverse());


    }
}
