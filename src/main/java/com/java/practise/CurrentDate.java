package com.java.practise;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by THOODI on 10/22/2016.
 */
public class CurrentDate {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY hh:mm:ss");
        String ctime = sdf.format(cal.getTime());
        System.out.println(ctime);
       // File dest = new File("D://google"+ctime+".jpg");

    }
}
