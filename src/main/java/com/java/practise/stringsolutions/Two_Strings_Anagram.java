package com.java.practise.stringsolutions;

import java.util.Arrays;

/**
 * Created by THOODI on 2/3/2017.
 */
public class Two_Strings_Anagram {

    static void isAnagram(String s1, String s2)
    {
        //Removing all white spaces from s1 and s2
        String copyOfs1 = s1.replaceAll("\\s", "");
        String copyOfs2 = s2.replaceAll("\\s", "");
        //Initially setting status as true
        boolean status = true;
        if(copyOfs1.length() != copyOfs2.length())
        {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
            status = false;
        }
        else
        {
            //Changing the case of characters of both copyOfs1 and copyOfs2 and converting them to char array
            char[] s1Array = copyOfs1.toLowerCase().toCharArray();
            char[] s2Array = copyOfs2.toLowerCase().toCharArray();
            //Sorting both s1Array and s2Array
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            //Checking whether s1Array and s2Array are equal
            status = Arrays.equals(s1Array, s2Array);
        }
        //Output
        if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }

    public static void main(String[] args)
    {
        isAnagram("Mother In Law", "Hitler Woman");
        isAnagram("keEp", "peeK");
    }

}


// Initially take 2 strings which are anagrams and remove  all the spaces
    /*String copyOfs1 = s1.replaceAll("\\s", ""); */
//check whether there length is equal or not. and set it to false if it is not equal
    /*if(copyOfs1.length() != copyOfs2.length())*/
//Now convert the String1 and string 2 to lowercase and as character array
    /*char[] s1Array = copyOfs1.toLowerCase().toCharArray();*/
//Now sort the String1 and String 2 to display in ascending order
    /*   Arrays.sort(s1Array);*/
//Now use equal method to compare the 2 char arrays and give the result as status to print.
/*status = Arrays.equals(s1Array, s2Array);*/
