package org.example;

public class SampleTest {
    public static void main(String[] args) {
        testaddPositive();
        testaddNegative();
    }
    public static void testaddPositive(){
        int result=Calculator.add(2,4);
                if(result==6){
                    System.out.println("testAddPositive PASSED");
                }
                else {
                    System.out.println("testAddPositive FAILED: Expected 6 but got "+result);
                }
    }
    public static void testaddNegative(){
        int result=Calculator.add(2,4);
        if(result==5){
            System.out.println("testAddNegative PASSED");
        }
        else {
            System.out.println("testAddNegative FAILED: Expected 5 but got "+result);
        }
    }
}
