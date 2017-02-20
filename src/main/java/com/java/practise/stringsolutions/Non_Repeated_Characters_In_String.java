package com.java.practise.stringsolutions;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by THOODI on 2/3/2017.
 */
public class Non_Repeated_Characters_In_String {
    public static void main(String[] args) {
        String s = "ffeeddbbaaclcko";
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        char c[] = s.toCharArray();

        for (char ch : c) {
            if (map.containsKey(ch)) {
                int count = map.get(ch);
                map.put(ch, count + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (char ch : c) {
            if (map.get(ch) == 1) {
                System.out.println("First non repeated characted in String \""
                        + s + "\" is:" + ch);
                break;
            }
        }
    }
}
/*
Output:
        First non repeated character in String "ffeeddbbaaclck" is:l*/
