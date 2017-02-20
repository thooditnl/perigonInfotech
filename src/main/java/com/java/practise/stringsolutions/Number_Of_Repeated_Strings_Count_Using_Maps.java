package com.java.practise.stringsolutions;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by THOODI on 2/2/2017.
 */
public class Number_Of_Repeated_Strings_Count_Using_Maps {
        public static void main(String[] args) {

            String str = "running";
            char[] char_array = str.toCharArray();
            System.out.println("The Given String is : " + str);
            Map<Character, Integer> charCounter = new TreeMap<Character, Integer>();
            for (char i : char_array) {
                charCounter.put(i,charCounter.get(i) == null ? 1 : charCounter.get(i) + 1);
                //Initially 'r' will be taken as key and the value is null which is equal to null. So the Condition is True.
                //the 'Value' will be set to  '1'. (r,1)
                //When n is taken , it is repeated 3 times so the value will be 3.

              //  System.out.println("After "+ (charCounter.get(i) + 1));
            }
            for (char key : charCounter.keySet()) {
                System.out.println("occurrence of '" + key + "' is  "+ charCounter.get(key));
            }
        }
}
//unique character --key
//count----integer