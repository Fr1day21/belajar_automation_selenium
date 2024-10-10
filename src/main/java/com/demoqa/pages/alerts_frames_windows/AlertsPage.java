package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class AlertsPage extends Alert_Frames_WindowsPage{

    private final By informationAlertButton = By.xpath("//button[@id='alertButton']");

    public void clickInformationAlertButton(){
        click(informationAlertButton);
    }


}
