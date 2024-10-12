package part3_4.com.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.SwitchToUtility.*;

@Test
public class AlertsTest extends BaseTest {


    public void testInformationAlert(){
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsWindowsCard().clickAlerts();
        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(), expectedAlertText,"\n Actual & Expected Messages Do Not Match\n");
        acceptAlert();
    }

    public void testConfirmationAlert(){
        var alertsPage = homePage.goToAlertsWindowsCard().clickAlerts();
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();
        String expectConfirmationResult = "You selected Cancel";
        String actualConfirmationResult = alertsPage.getConfirmationResult();

        Assert.assertEquals(actualConfirmationResult, expectConfirmationResult, "You Did Not Select Cancel");
    }

    public void testPromptAlert(){
        String alertText = "Selenium With Java";
        String expectedResult = "You entered " + alertText;

        var alertsPage = homePage.goToAlertsWindowsCard().clickAlerts();
        alertsPage.clickPromptAlertButton();
        setAlertText(alertText);
        acceptAlert();
        String actualResult = alertsPage.getPromptAlertResult();
        Assert.assertEquals(actualResult,expectedResult, "\n Actual & Expected Result Do Not Match \n");
    }



}
