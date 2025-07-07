package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {

    @DataProvider
    public Object[][] testData(){
        return new Object[][]{
                {"user1","password1"},
                {"user2","password2"}
        };
    }
    @Test(dataProvider = "testData")
    public void DPtest(String userName,String password){
        System.out.println("-----Start-----");
        System.out.println("User Name : "+userName);
        System.out.println(" Password : "+password);
        System.out.println("------End------");

    }
}
