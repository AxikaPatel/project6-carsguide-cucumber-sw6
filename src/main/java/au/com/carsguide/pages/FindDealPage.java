package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class FindDealPage extends Utility
{
    private static final Logger log = LogManager.getLogger(FindDealPage.class.getName());

    public FindDealPage()
    {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(tagName = "h1")
    WebElement verifyPageFindDeal;

    public void verifyPageFindDeal()
    {
        String expectedMessage = "Find a Car Dealership Near You";
        String actualMessage = getTextFromElement(verifyPageFindDeal);
        Assert.assertEquals(expectedMessage,actualMessage);
        Reporter.log("Verify page find deal:"+verifyPageFindDeal.toString());
        log.info("Verify page find deal:"+verifyPageFindDeal.toString());
    }
}
