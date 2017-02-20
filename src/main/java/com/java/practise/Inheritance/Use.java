package com.java.practise.Inheritance;

/**
 * Created by THOODI on 11/3/2016.
 */
public class Use {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(20);
        s.setName("Kiran");
        s.setAddress("2075, salt lake city, utah");
        s.setMarks(50);
        s.setSal(20);
        System.out.println("The id of the student is:"+s.getId());
        System.out.println("The Name of the student is:"+s.getName());
        System.out.println("The Address of the student is:"+s.getAddress());
        System.out.println("The marks of the student is:"+s.getMarks());
        System.out.println("The sal of the student is:"+s.getSal());
    }
}
