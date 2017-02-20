package com.java.practise.SchoolDetails;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by THOODI on 11/27/2016.
 */
public class School {
    private String Dept;
    private int subjectMarks1;
    private int subjectMarks2;
    private int subjectMarks3;
    private float avg;
    private String name;
    private String rollNum;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollNum(String rollNum) {
        this.rollNum = rollNum;
    }

    public String getRollNum() {
        return rollNum;
    }


    public School(String dept, int subjectMarks1, int subjectMarks2, int subjectMarks3) {
        Dept = dept;
        this.subjectMarks1 = subjectMarks1;
        this.subjectMarks2 = subjectMarks2;
        this.subjectMarks3 = subjectMarks3;

    }

    void display(){
        //System.out.println("Name is: " + name);
        //System.out.println("The Roll Number is: " + rollNumber);
        System.out.println("The Dept is:  " + Dept);
        System.out.println("The Subject1 marks are :" + subjectMarks1);
        System.out.println("The Subject2 marks are : " + subjectMarks2);
        System.out.println("The Subject3 marks are : " + subjectMarks3);
        System.out.println("The Avg of three subjects are: " + average());
    }
    float average()
        {
            avg = (subjectMarks1+subjectMarks2+subjectMarks3) / 3;
            return avg;
        }

    void accept() throws IOException {
        InputStreamReader inr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inr);
        System.out.println("Enter the name of the person:");
        String name = br.readLine();
        System.out.println("Enter the Roll Number of person:");
        int rollNumber = Integer.parseInt(br.readLine());
        System.out.println("The name and rollNumber is: " +name + "\t"+ rollNumber);
    }
}

class Students{
    public static void main(String[] args) throws IOException {
        School obj1 = new School("ECE",100,20,30);
//        obj1.accept();
        obj1.display();

    }
}



