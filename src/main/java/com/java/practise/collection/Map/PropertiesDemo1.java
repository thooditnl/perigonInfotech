package com.java.practise.collection.Map;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
//C:\Users\THOODI\Workspace\FriendlyConsultancy\src\com\chapter\first\collection\abc.properties

/**
 * Created by THOODI on 2/10/2017.
 */
public class PropertiesDemo1 {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
    //  FileInputStream fil = new FileInputStream("src\\com\\chapter\\first\\collection\\abc.properties");
        InputStream fil = PropertiesDemo1.class.getResourceAsStream("abc.properties");
        p.load(fil);
        System.out.println(p);
        String s = p.getProperty("username");
        System.out.println(s);
        p.setProperty("pwd","1234");
        FileOutputStream fout = new FileOutputStream("src\\com\\chapter\\first\\collection\\abc.properties");
        p.store(fout, "Updated by Kiran");

    }
}
