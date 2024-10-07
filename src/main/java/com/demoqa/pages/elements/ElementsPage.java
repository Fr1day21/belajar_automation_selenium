package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

public class ElementsPage extends HomePage {

    private final By webTablesMenuItem = By.xpath("//span[text()='Web Tables']");


    public WebTablePage clickWebTables(){
        click(webTablesMenuItem);
        return new WebTablePage();
    }


}
