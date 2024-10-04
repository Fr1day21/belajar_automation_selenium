package com.saucedemo.tests.products;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductHeaderIsDisplayed(){
        ProductPage productPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        Assert.assertTrue(productPage.isProductHeaderDisplayed(), "\nProducts Header Is Not Displayed\n");
    }

}
