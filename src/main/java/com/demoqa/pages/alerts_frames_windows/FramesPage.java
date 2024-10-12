package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;

public class FramesPage extends Alert_Frames_WindowsPage{

    private final By textInframe = By.id("sampleHeading");
    private String iFrameBigBox = "frame1";
    private final By headerFramesText = By.xpath("//h1[text()='Frames']");

    private void switchToBigBox(){
        switchToFramesString(iFrameBigBox);

    }

    public String getHeaderFramesText(){
        return find(headerFramesText).getText();
    }


    public String getTextInBigFrame(){
        switchToBigBox();
        String bigFrameText = find(textInframe).getText();
        System.out.println("Big Frame Text: " + bigFrameText);
        switchToDefaultContent();
        return bigFrameText;
    }





}
