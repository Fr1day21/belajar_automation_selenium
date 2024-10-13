package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage {

    private final By selectMenuItem = By.xpath("//span[text()='Select Menu']");
    private final By datePickerMenuItem = By.xpath("//span[text()='Date Picker']");
    private final By progressBarMenuItem = By.xpath("//span[text()='Progress Bar']");

    public SelectMenuPage clickSelectMenu(){
        scrollToElementJS(selectMenuItem);
        click(selectMenuItem);
        return new SelectMenuPage();
    }

    public DatePickerMenuPage clickDatePicker(){
        scrollToElementJS(datePickerMenuItem);
        click(datePickerMenuItem);
        return new DatePickerMenuPage();
    }

    public ProgressBarPage clickProgressBar(){
        scrollToElementJS(progressBarMenuItem);
        click(progressBarMenuItem);
        return new ProgressBarPage();
    }


}
