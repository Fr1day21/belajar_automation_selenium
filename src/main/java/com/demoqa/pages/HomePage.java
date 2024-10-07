package com.demoqa.pages;

import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private final By formCard = By.xpath("//h5[text()='Forms']");
    private final By elementsCard = By.xpath("//h5[text()='Elements']");

    public FormsPage goToFroms(){
        scrollToElementJS(formCard);
        click(formCard);
        return new FormsPage();
    }

    public ElementsPage goToElements(){
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }




}
