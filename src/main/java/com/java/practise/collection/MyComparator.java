package com.java.practise.collection;

import java.util.Comparator;

/**
 * Created by THOODI on 2/7/2017.
 */
public class MyComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        Integer I1 = (Integer)o1;
        Integer I2 = (Integer)o2;
        if(I1 < I2)
            return +1;
        else if(I1 > I2)
            return -1;
        else
            return 0;
    }
}
