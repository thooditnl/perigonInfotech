package com.testng.practise;

import org.testng.annotations.*;

/**
 * Created by THOODI on 2/22/2017.
 */
public class Testng_practise {


    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite method");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite method");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest method");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Beforeclass method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass method");
    }
    @BeforeMethod
    public void beforeSetUp(){
        System.out.println("Before method");
    }
    @AfterMethod
    public void afterSetUp(){
        System.out.println("After method");
    }

    @Test
    public void firstUp(){
        System.out.println("First Test");
    }
    @Test
    public void secondUp(){
        System.out.println("Second Test");
    }

    @Test
    public void thirdUp(){
        System.out.println("Third Test");
    }
    @Test
    public void acceptUp(){
        System.out.println("fourth Test");
    }
    @Test
    public void q1(){
        System.out.println("q1 Test");
    }
    @Test
    public void q2(){
        System.out.println("q2 Test");
    }
    @Test
    public void q3(){
        System.out.println("q3 Test");
    }


}



// All "@Test" methods will be executed in ascending order
// "Before Method" will execute before every @test.
// "After Method" will execute after every @test