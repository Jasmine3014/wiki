package stepdefinitions;

import io.cucumber.java.en.Then;
import io.qameta.allure.Step;
import org.testng.Assert;
import pages.InformationPage;

public class InformationPageSteps {
    private final InformationPage informationPage = new InformationPage();

    @Then("I verify that the information page of {string} is displayed")
    public void articlePageDisplayed(String articleTitle) {
        boolean isArticleDisplayed = informationPage.isArticleDisplayed(articleTitle);
        Assert.assertTrue(isArticleDisplayed,
                "The article title does not contain '%s'.".formatted(articleTitle));
    }
}
