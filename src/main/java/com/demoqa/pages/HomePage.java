package com.demoqa.pages;

import com.demoqa.pages.alerts_frames_windows.Alert_Frames_WindowsPage;
import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import com.demoqa.pages.widgets.WidgetsPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private final By formCard = By.xpath("//h5[text()='Forms']");
    private final By elementsCard = By.xpath("//h5[text()='Elements']");
    private final By widgetsCard = By.xpath("//h5[text()='Widgets']");
    private final By alertsFrameWindowsCard = By.xpath("//h5[text()='Alerts, Frame & Windows']");

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

    public WidgetsPage goToWidgets(){
        scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new WidgetsPage();
    }

    public Alert_Frames_WindowsPage goToAlertsFramesWindowsCard(){
        scrollToElementJS(alertsFrameWindowsCard);
        click(alertsFrameWindowsCard);
        return new Alert_Frames_WindowsPage();
    }




}
