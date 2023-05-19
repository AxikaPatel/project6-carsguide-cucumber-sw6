package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class NewUsedCarPage extends Utility
{
    private static final Logger log = LogManager.getLogger(NewUsedCarPage.class.getName());

    public NewUsedCarPage()
    {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(tagName = "h1")
    WebElement verifyTextNewAndUsedCar;

    public void verifyTextNewUsedCar()
    {
        String expectedMessage = "New & Used Car Search - carsguide";
        String actualMessage = getTextFromElement(verifyTextNewAndUsedCar);
        Assert.assertEquals(expectedMessage,actualMessage);
        Reporter.log("Verify Text New used Car : " + verifyTextNewAndUsedCar.toString());
        log.info("Verify Text New used Car : " + verifyTextNewAndUsedCar.toString());
    }

    @CacheLookup
    @FindBy(css = "#makes")
    WebElement selectMake;

    public void selectMake(String make)
    {

        selectByVisibleTextFromDropDown(selectMake,make);
        Reporter.log("Select make :" + selectMake.toString());
        log.info("Select make :" + selectMake.toString());

    }

    @CacheLookup
    @FindBy(css = "#models")
    WebElement selectModel;

    By modelSelect = By.cssSelector("#models");
    public void selectModel(String model)
    {
        selectByVisibleTextFromDropDown(selectModel,model);
        Reporter.log("Select Model : "+selectModel.toString());
        log.info("Select Model : "+selectModel.toString());
    }

    @CacheLookup
    @FindBy(css = "#locations")
    WebElement selectLocation;

    By locationSelect = By.cssSelector("#locations");
    public void selectLocation(String location)
    {
        selectByVisibleTextFromDropDown(selectLocation,location);
        Reporter.log("Select location : "+selectLocation.toString());
        log.info("Select location : "+selectLocation.toString());
    }

    @CacheLookup
    @FindBy(css = "#priceTo")
    WebElement selectPrice;

    By priceSelect = By.cssSelector("#priceTo");
    public void selectPrice(String price)
    {
        selectByVisibleTextFromDropDown(selectPrice,price);
        Reporter.log("Select price : "+selectPrice.toString());
        log.info("Select price : "+selectPrice.toString());
    }

    @CacheLookup
    @FindBy(css = "#search-submit")
    WebElement clickFindMyNextCar;

    public void clickOnFindMyNextCar()
    {
        clickOnElement(clickFindMyNextCar);
        Reporter.log("Click on find my new car");
        log.info("Click on find my new car");
    }

}
