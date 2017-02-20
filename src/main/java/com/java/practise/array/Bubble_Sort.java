package com.java.practise.array;

import java.util.Scanner;

/**
 * Created by THOODI on 2/2/2017.
 */
public class Bubble_Sort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many Elements?");

        int n = sc.nextInt();
        int arr[] = new int[n];   // here it will get the array size

        for(int i=0;i<n;i++){
            System.out.println("Enter int: ");
            arr[i] = sc.nextInt();  // inserting the elements in the array
        }
        int limit =n-1;
        boolean flag =false; //if it true, swapping is done
        int temp;

        for(int i=0;i<limit; i++){
            for(int j=0;j<limit-1;j++){
                //if first element is bigger than second one, then swap
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true; //true ---> Swapping done
                }
            }
            if(flag==false) break; //no swapping, so come out
            else flag=false; //assign initial value
        }

        //display the sorted array
        System.out.println("The sorted array is: ");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}

//no of iterations required is 3.
