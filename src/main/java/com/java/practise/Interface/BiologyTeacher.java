package com.java.practise.Interface;

/**
 * Created by THOODI on 2/12/2017.
 */
public class BiologyTeacher implements ITeacher {
    @Override
    public void teachingClass() {
        System.out.println( "B Concepts");
    }

    @Override
    public void doAssignments() {
        System.out.println("B Assignments");
    }

    @Override
    public void doCorrections() {
        System.out.println("B Corrections");
    }

    @Override
    public void conductTest() {
        System.out.println("B Tests");
    }

    @Override
    public int cop() {
        return 'c';
    }
}
