package com.java.practise.stringsolutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by THOODI on 2/3/2017.
 */

//“paper” and  “title” are isomorphic. Here ‘p’ can be mapped to ‘t’, ‘a’ to ‘i’, ‘e’ to ‘l’ and ‘r’ to ‘e’.
public class IsomorphicString {
    public static void main(String[] args) {
        checkIfIsoMorphic("paper", "title");
        checkIfIsoMorphic("foo", "app");
        checkIfIsoMorphic("foo", "bar");
    }

    private static void checkIfIsoMorphic(String s1, String s2) {
        if (s1.length() == s2.length()) {
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            if (s1.equals(s2)) {
                System.out.println(s1 + " and " + s2 + " are Isomorphic");
            } else {
                boolean isomorphic = true;
                Map<Character, Character> map = new HashMap<Character, Character>(
                        0);
                Set<Character> mappedChars = new HashSet<Character>();
                for (int i = 0; i < s1.length(); i++) {
                    char c1 = s1.charAt(i);
                    char c2 = s2.charAt(i);
                    if (map.containsKey(c1)) {
                        if (map.get(c1) != c2) {
                            isomorphic = false;
                            break;
                        }
                    } else {
                        if (mappedChars.contains(c2)) {
   /** If the character c2 is already mapped to some other character in String1 then it cannot be mapped again to c1 */
                            isomorphic = false;
                            break;
                        } else {
                            map.put(c1, c2);
                            mappedChars.add(c2);
                        }
                    }
                }
                if (isomorphic) {
                    System.out.println(s1 + " and " + s2 + " are Isomorphic");
                } else {
                    System.out.println(s1 + " and " + s2 + " are not Isomorphic");
                }
            }
        } else {
            System.out.println(s1 + " and " + s2 + " are not Isomorphic");
        }
    }
}
