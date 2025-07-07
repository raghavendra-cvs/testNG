package org.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClassTest {

    @BeforeClass
    public void setup(){
        System.out.println("This method will be executed before any Test method in the Class");
    }

    @Test
    public void testmethod1(){
        System.out.println("This is actual test method 1");
    }

    @Test
    public void testmethod2(){
        System.out.println("This is actual test method 2");
    }

    @AfterClass
    public void teardown(){
        System.out.println("This method will be executed after all Test method in the Class");
    }

}
