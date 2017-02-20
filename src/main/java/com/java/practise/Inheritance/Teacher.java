package com.java.practise.Inheritance;

/**
 * Created by THOODI on 11/3/2016.
 */
public class Teacher {
    int id;
    String name;
    String address;
    float sal;
    int marks;
    void setId(int id){
        this.id =id;
    }
    int getId(){
        return id;
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void setAddress(String address){
        this.address=address;
    }
    String getAddress(){
        return address;
    }
    void setSal(float sal){
        this.sal =sal;
    }
    float getSal(){
        return sal;
    }

}
