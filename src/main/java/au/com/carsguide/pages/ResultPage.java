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

public class ResultPage extends Utility
{
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage()
    {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    //@FindBy(css = "div.container.search-results-container:nth-child(4) div.search-results-page.ng-scope:nth-child(1) div.row div.listing-col.listing-col-title.col-sm-16.col-md-12.col-lg-13.col.location-set:nth-child(3) > h1.listing-search-title")
            @FindBy(xpath = "//h1[@class='listing-search-title']")
    WebElement verifyMakeInResult;

@CacheLookup
@FindBy(xpath = "//div[@class='listing-col listing-col-title col-sm-16 col-md-12 col-lg-13 col location-set']//h1[@class='listing-search-title']")
WebElement searchResult;
//By searchResult = By.xpath("//div[@class='listing-col listing-col-title col-sm-16 col-md-12 col-lg-13 col location-set']");
public void verifyMakeResult(String expected)
{
    String expectedMessage =expected;
    String actualMessage = getTextFromElement(verifyMakeInResult);
    Assert.assertEquals(expectedMessage,actualMessage);
    Reporter.log("Verify the result :" + verifyMakeInResult.toString());
    log.info("Verify the result :" + verifyMakeInResult.toString());
}




}


