package com.java.practise.collection.List.ArrayList;

import java.util.ArrayList;

/**
 * Created by THOODI on 2/7/2017.
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("A");
        l.add(10);
        l.add("A");
        l.add(null);

      /*  Iterator itr = l.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }*/

       /* ListIterator litr = l.listIterator();
        while(litr.hasNext()){
            System.out.println(litr.next());
        }*/

     /*  for(int i=0;i<l.size();i++){
           System.out.println(l.get(i));
       }*/

    //    l.forEach(item->System.out.println(item));

        for(Object o: l){
            System.out.println(o);
        }
    }
}
