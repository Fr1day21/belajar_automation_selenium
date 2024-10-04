package com.saucedemo.tests.login;

import com.saucedemo.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void testLoginErrorMessage(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("dadad79797");
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }




}
