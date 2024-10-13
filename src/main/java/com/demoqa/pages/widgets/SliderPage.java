package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static utilities.ActionsUtility.dragAndDropBy;
import static utilities.GetUtility.getAttribute;

public class SliderPage extends WidgetsPage{

    private final By slider = By.xpath("//div[@id='sliderContainer']//input[@type='range']");
    private final By sliderValue = By.id("sliderValue");

    public void moveSlider(int x, int y){
//        Actions actions = new Actions(driver);
//        actions.dragAndDropBy(find(slider), x, y).perform();
        dragAndDropBy(find(slider), x , y);
    }

    public String getSliderValue(){
        return getAttribute(sliderValue, "value");
    }





}
