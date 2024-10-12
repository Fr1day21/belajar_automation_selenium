package part3_4.com.demoqa.tests.part4.frames;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class FramesTest extends BaseTest {


    @Test
    public void testFramesBigBox(){
        var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrames();
        String actualBigBoxTest = framesPage.getTextInBigFrame();
        String expectedBigBoxText = "This is a sample page";
        Assert.assertEquals(actualBigBoxTest, expectedBigBoxText, "\n Actual & Expected Text Do Not Match \n");

        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectHeaderText, "\n Actual & Expected Header Text Do Not Match\n");
    }



    @Test
    public void  testFramesSmallBox(){
        var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrames();
        String actualSmallBoxText = framesPage.getTextInSmallFrame();
        String expectedSmallBoxText = "This is a sample page";
        Assert.assertEquals(actualSmallBoxText, expectedSmallBoxText, "\n Actual & Expected Text Do Not Match \n");
        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectHeaderText, "\n Actual & Expected Header Text Do Not Match\n");
    }







}
