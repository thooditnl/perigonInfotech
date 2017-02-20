package com.java.practise.collection.Collections_Concept;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by THOODI on 2/11/2017.
 */
public class CollectionsSearchDemo1 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("M");
        l.add("K");
        l.add("a");
        System.out.println(l);  //[Z, A, M, K, a]
        Collections.sort(l);  // THis is mandatory before searching operation takes place. or else we will get unpredictable Results.
        System.out.println(l);  //  [A, K, M, Z, a]
        System.out.println(Collections.binarySearch(l,"K"));  //1
        System.out.println(Collections.binarySearch(l,"J"));  // -2 insertion point if any element is not present in the list.
    }
}
