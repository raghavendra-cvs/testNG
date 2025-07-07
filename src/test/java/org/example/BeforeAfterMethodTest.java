package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodTest {

    @BeforeMethod
    public void setup(){
        System.out.println("This method will be executed before each Test method ");
    }

    @Test
    public void testmethod1(){
        System.out.println("This is actual test method 1");
    }

    @Test
    public void testmethod2(){
        System.out.println("This is actual test method 2");
    }

    @AfterMethod
    public void teardown(){
        System.out.println("This method will be executed after each Test method ");
    }
}
