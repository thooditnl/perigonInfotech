package com.java.practise.array;

import java.util.Scanner;

/**
 * Created by THOODI on 2/2/2017.
 */
public class Marks_Of_Student_Cal_TotalMarks_Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the subjects: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

       for(int i=0; i<n;i++){
            System.out.println("Enter the marks: ");
            arr[i]=sc.nextInt();
        }

        int tot =0;
        for(int i=0;i<n;i++)
            tot = tot+arr[i];
            System.out.println("Total marks: "+ tot);

            float percentage = (float)tot/n;
        System.out.println("percentage = "+ percentage);
    }
}
