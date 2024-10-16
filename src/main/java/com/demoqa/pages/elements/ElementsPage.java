package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends HomePage {

    private final By webTablesMenuItem = By.xpath("//span[text()='Web Tables']");
    private final By linksMenuItem =  By.xpath("//li[@id='item-5']//span[text()='Links']");
    private final By dynamicPropertiesMenuItem = By.xpath("//span[text()='Dynamic Properties']");
    private final By textBoxMenuItem = By.xpath("//span[text()='Text Box']");


    public WebTablePage clickWebTables(){
        click(webTablesMenuItem);
        return new WebTablePage();
    }

    public LinksPage clickLinks(){
        click(linksMenuItem);
        return new LinksPage();
    }

    public DynamicPropertiesPage clickDynamicProperties(){
        scrollToElementJS(dynamicPropertiesMenuItem);
        click(dynamicPropertiesMenuItem);
        return  new DynamicPropertiesPage();
    }

    public TextBoxPage clickTextBox(){
        scrollToElementJS(textBoxMenuItem);
        click(textBoxMenuItem);
        return new TextBoxPage();
    }


}
