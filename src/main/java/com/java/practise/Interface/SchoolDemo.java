package com.java.practise.Interface;

/**
 * Created by THOODI on 2/12/2017.
 */
public class SchoolDemo {
    public static void main(String[] args) {
        ITeacher sTeacher = new ScienceTeacher();  //Loose Coupling
        ITeacher bTeacher = new BiologyTeacher();   //Loose Coupling
        ScienceTeacher s1 = new ScienceTeacher();
        BiologyTeacher b1 = new BiologyTeacher();

        sTeacher.teachingClass();  // S Teaches
        s1.teachingClass();  //   S  Teaches
        bTeacher.teachingClass();   //B Concepts
        b1.teachingClass();   //   B Concepts
       double v = ITeacher.CONSTANT;
       System.out.println(v);
    }
}
