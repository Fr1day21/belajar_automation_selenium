package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.*;

public class PracticeFromPage extends FormsPage{

    private final By femaleRadioButton = By.id("gender-radio-2");
    private final By sportHobbyCheckbox = By.id("hobbies-checkbox-1");
    private final By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private final By musicHobbyCheckbox = By.id("hobbies-checkbox-3");

    public void clickFemaleRadiButton (){
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleSelected(){
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportHobbyCheckbox(){
        if(!find(sportHobbyCheckbox).isSelected()){
           scrollToElementJS(sportHobbyCheckbox);
           clickJS(sportHobbyCheckbox);
        }
    }

    public void clickReadingHobbyCheckbox(){
        if(!find(readingHobbyCheckbox).isSelected()){
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public void clickMusicHobbyCheckbox(){
        if(!find(musicHobbyCheckbox).isSelected()){
            scrollToElementJS(musicHobbyCheckbox);
            clickJS(musicHobbyCheckbox);
        }
    }

    public void unclickReadingHobbyCheckbox(){
        if(find(readingHobbyCheckbox).isSelected()){
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }



    public boolean isReadingSelected(){
        return find(readingHobbyCheckbox).isSelected();
    }


}
