package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class ModelDialogPage extends Alert_Frames_WindowsPage{

    private final By smallModalButton = By.id("showSmallModal");
    private final By smallModalText = By.xpath("//div[contains(text(),'small modal')]");
    private final By closeButton = By.id("closeSmallModal");


    public void clickSmallModalButton(){
        click(smallModalButton);
    }

    public String getSmallModalText(){
        return find(smallModalText).getText();
    }

    public void clickCloseButton(){
        click(closeButton);
    }




}
