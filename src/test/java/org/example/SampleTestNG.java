package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestNG {
    @Test
    public void testAddPositive(){
        Assert.assertEquals(Calculator.add(3,4),7);
    }
    @Test
    public void testAddNegative(){
        Assert.assertEquals(Calculator.add(3,2),5);
    }
}
