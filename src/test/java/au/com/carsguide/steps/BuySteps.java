package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.NewUsedCarPage;
import au.com.carsguide.pages.ResultPage;
import au.com.carsguide.pages.UsedCarForSalePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuySteps
{
    @Given("^I am on homepage$")
    public void iAmOnHomepage()
    {
    }


    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab()
    {
        new HomePage().mouseHooverOnBuyAndSellMenuTab();
    }

    @And("^I click ‘Search Cars’ link$")
    public void iClickSearchCarsLink()
    {
        new HomePage().mouseHooverOnSearchCarsAndClick();
    }


    @Then("^I navigate to ‘new and used car search’ page$")
    public void iNavigateToNewAndUsedCarSearchPage()
    {
        new NewUsedCarPage().verifyTextNewUsedCar();
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make)
    {
        new NewUsedCarPage().selectMake(make);

    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model)
    {
        new NewUsedCarPage().selectModel(model);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location)
    {
        new NewUsedCarPage().selectLocation(location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price)
    {
        new NewUsedCarPage().selectPrice(price);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab()
    {
        new NewUsedCarPage().clickOnFindMyNextCar();
    }



    @And("^I click 'Used' link$")
    public void iClickUsedLink()
    {
        new HomePage().mouseHooverOnUsedCarsAndClick();
    }

    @Then("^I navigate to 'Used Cars For Sale' page$")
    public void iNavigateToUsedCarsForSalePage()
    {
        new UsedCarForSalePage().verifyTextUsedCar();
    }




    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String verifymakepage) {
       new ResultPage().verifyMakeResult(verifymakepage);
    }
}
