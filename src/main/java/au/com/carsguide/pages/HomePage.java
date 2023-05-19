package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility
{
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(linkText = "buy + sell")
    WebElement buySellMenuTab;

    public void mouseHooverOnBuyAndSellMenuTab()
    {
        mouseHoverToElement(buySellMenuTab);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Search Cars']")
    WebElement searchCars;

    public void mouseHooverOnSearchCarsAndClick()
    {
        mouseHoverToElementAndClick(searchCars);
        log.info("Mouse hoover on search car and click :"+searchCars.toString());
    }

    @CacheLookup
    @FindBy(linkText = "Used")
    WebElement usedCar;

    public void mouseHooverOnUsedCarsAndClick()
    {
        mouseHoverToElementAndClick(usedCar);
        log.info("Mouse hoover on Used car and click : "+usedCar.toString());
    }

    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'Find a Dealer')]")
    WebElement findADealer;

    public void mouseHooverOnFindADealerAndClick()
    {
        mouseHoverToElementAndClick(findADealer);
        log.info("Mouse hoover on find dealer and click : "+findADealer.toString());
    }
}
