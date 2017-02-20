package com.java.practise.collection.Cursor;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by THOODI on 2/6/2017.
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.add("Ramu");
        li.add("Rakesh");
        li.add("kylash");
        li.add("ammer");
        System.out.println(li);  // [Ramu, Rakesh, kylash, ammer]

        ListIterator ltr = li.listIterator();
        while(ltr.hasNext()){
            String s = (String)ltr.next();
            if(s.equals("ammer")){
                ltr.remove();
            }
            else if(s.equals("Rakesh")){
                ltr.add("raki");
            }
            else if(s.equals("Ramu")){
                ltr.set("kkkk");                     //It will replace the old string with new string
            }
        }
        System.out.println(li);  // [kkkk, Rakesh, raki, kylash]
    }
}
