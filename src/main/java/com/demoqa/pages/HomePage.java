package com.demoqa.pages;

import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By formCard = By.xpath("//h5[text()='Forms']");

    public FormsPage goToFroms(){
        scrollToElementJS(formCard);
        click(formCard);
        return new FormsPage();
    }




}
