package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class Alert_Frames_WindowsPage extends HomePage {

    private final By modalDialogsMenuItem = By.xpath("//span[text()='Modal Dialogs']");
    private final By alertsMenuItem = By.xpath("//span[text()='Alerts']");
    private final By framesMenuItem = By.xpath("//span[text()='Frames']");
    private final By browserWindowsMenuItem = By.xpath("//span[text()='Browser Windows']");


    public AlertsPage clickAlerts(){
        scrollToElementJS(alertsMenuItem);
        click(alertsMenuItem);
        return new AlertsPage();
    }


    public ModelDialogPage clickModalDialogs(){
        scrollToElementJS(modalDialogsMenuItem);
        click(modalDialogsMenuItem);
        return new ModelDialogPage();
    }

    public FramesPage clickFrames(){
        scrollToElementJS(framesMenuItem);
        click(framesMenuItem);
        return new FramesPage();
    }

    public BrowserWindowsPage clickBrowserWindows(){
        scrollToElementJS(browserWindowsMenuItem);
        click(browserWindowsMenuItem);
        return new BrowserWindowsPage();
    }



}
