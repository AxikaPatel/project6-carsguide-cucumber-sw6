package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class UsedCarForSalePage extends Utility
{
    private static final Logger log = LogManager.getLogger(UsedCarForSalePage.class.getName());

    public UsedCarForSalePage()
    {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(tagName = "h1")
    WebElement verifyTextUsedCar;

    public void verifyTextUsedCar()
    {
        String expectedMessage = "Used Cars For Sale";
        String actualMessage = getTextFromElement(verifyTextUsedCar);
        Assert.assertEquals(expectedMessage,actualMessage);
        log.info("Verify text used car :" + verifyTextUsedCar.toString());
    }
}
