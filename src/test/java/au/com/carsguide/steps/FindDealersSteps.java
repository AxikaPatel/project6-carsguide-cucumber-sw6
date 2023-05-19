package au.com.carsguide.steps;

import au.com.carsguide.pages.FindDealPage;
import au.com.carsguide.pages.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.List;

public class FindDealersSteps
{
    @And("^I click 'Find a Dealer'$")
    public void iClickFindADealer()
    {
        new HomePage().mouseHooverOnFindADealerAndClick();
    }

    @Then("^I navigate to ‘car-dealers’ page$")
    public void iNavigateToCarDealersPage()
    {
        new FindDealPage().verifyPageFindDeal();
    }

    @And("^I should see the dealer names <dealersName> are display on page$")
    public void iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage(DataTable dataTable)
    {
        List<List<String>>userList = dataTable.asLists(String.class);
        for (List<String> e : userList)
        {
            //   System.out.println(e);
            System.out.println(e.get(0));

        }
    }


}
