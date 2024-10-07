package com.demoqa.pages.forms;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class FormsPage extends HomePage {

    private By practiceFromMenuItem = By.xpath("//span[text()='Practice Form']");

    public PracticeFromPage clickPracticeForm(){
        scrollToElementJS(practiceFromMenuItem);
        click(practiceFromMenuItem);
        return new PracticeFromPage();
    }



}
