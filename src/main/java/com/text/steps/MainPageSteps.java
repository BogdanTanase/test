package com.text.steps;


import com.text.page.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainPageSteps {

    MainPage mainPage = new MainPage();

    @Given("An user goes to Altex main page")
    public void openMainPage() {
        mainPage.openMainPage();
    }

    @When("The user inserts televizor in the search bar")
    public void theUserInsertsTelevizorInTheSearchBar() {
        mainPage.search("televizor");
    }

    @When("The user presses the search button")
    public void theUserPressesTheSearchButton() {
        mainPage.pressSearchButton();
    }

    @Then("A search list will be populated")
    public void aSearchListWillBePopulated() {
        mainPage.searchPageWorked();
    }
}
