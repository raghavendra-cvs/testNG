package org.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
//    String username="Rakesh";
//    String password="Ram@123";

    @Test
    @Parameters({"username","password"})
    public void login(String username,String password){
        System.out.println("UserName :"+username);
        System.out.println("Password :"+password);
    }
}
