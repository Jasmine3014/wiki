package stepdefinitions;

import constants.Languages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;

public class HomePageSteps {
     private final HomePage homePage = new HomePage();

    @Then("Homepage is displayed")
    public void homePageDisplayed() {
        Assert.assertTrue(homePage.state().waitForDisplayed(), "Homepage is not displayed");
    }

    @When("I type {string}")
    public void searchText(String text) {
        homePage.inputText(text);
    }

    @When("I change the language to {string}")
    public void changeLanguage(String language) {
        Languages selectedLanguage = Languages.valueOf(language.toUpperCase());
        homePage.clickToChangeLanguage(selectedLanguage);
    }

    @When("I click the search button")
    public void clickSerachButton() {
        homePage.clickSearchBtn();
    }
}
