package com.java.practise.Interface;

/**
 * Created by THOODI on 2/12/2017.
 */
public class ScienceTeacher implements ITeacher{


    public void teachingClass() {
        System.out.println("S Teaches");
    }

    @Override
    public void doAssignments() {
        System.out.println("S Assignments");
    }

    @Override
    public void doCorrections() {
        System.out.println("S Corrections");
    }

    @Override
    public void conductTest() {
        System.out.println("S Test");
    }

    @Override
    public int cop() {
        return 0;
    }
}
