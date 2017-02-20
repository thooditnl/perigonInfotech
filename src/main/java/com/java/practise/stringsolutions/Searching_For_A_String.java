package com.java.practise.stringsolutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by THOODI on 2/2/2017.
 */

// Searching for a string from a given strings.
public class Searching_For_A_String {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Strings? ");
        String x = br.readLine();// to read the given strings

        int n = Integer.parseInt(x);  // to count the no of Strings
        String arr[] = new String[n]; //creating a string type array with size n

        for(int i=0;i<n;i++){
            System.out.println("Enter Strings:");
            arr[i] = br.readLine();    //Stores in the array
        }
        System.out.println("Enter String to search:");
        String search = br.readLine();   // reads the searching string

        boolean found = false;  // initially it set to false

        for(int i=0;i<n;i++){             // It searches all the words in the array
            if(search.equalsIgnoreCase(arr[i])){
                System.out.println("found at position:"+ (i+1));
                found =true; //string found
            }
        }
        //if not found, display message
        if(!found)
            System.out.println("Not found in the group");
    }
}
