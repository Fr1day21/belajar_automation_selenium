package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;

public class FramesPage extends Alert_Frames_WindowsPage{

    private final By textIframe = By.id("sampleHeading");
    private final String iFrameBigBox = "frame1";
    private final By headerFramesText = By.xpath("//h1[text()='Frames']");
    private final By iFrameSmallBox = By.xpath("//div[@id='frame2Wrapper']//iframe");

    private void switchToBigBox(){
        switchToFramesString(iFrameBigBox);

    }

    public String getHeaderFramesText(){
        return find(headerFramesText).getText();
    }


    public String getTextInBigFrame(){
        switchToBigBox();
        String bigFrameText = find(textIframe).getText();
        System.out.println("Big Frame Text: " + bigFrameText);
        switchToDefaultContent();
        return bigFrameText;
    }

    private void switchToSmallBox(){
//        switchToFrameIndex(3);
        switchToFrameElement(find(iFrameSmallBox));
    }


    public String getTextInSmallFrame(){
        delay(2000);
        switchToSmallBox();
        String smallFrameText = find(textIframe).getText();
        System.out.println("Small Frame Text : " + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }





}
