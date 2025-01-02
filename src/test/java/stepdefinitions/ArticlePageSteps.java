package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ArticlePage;

public class ArticlePageSteps {
    private final ArticlePage articlePage = new ArticlePage();

    @When("I click Download as PDF button from tools menu")
    public void clickDownloadAsPdfButton() {
        articlePage.clickOnToolMenu();
        articlePage.clickOnDownloadAsPdf();
    }

    @When("I click Page information button from tools menu for view the article")
    public void pageInformationBtn() {
        articlePage.clickOnToolMenu();
        articlePage.clickOnPageInfo();
    }

    @Then("I verify that {string} Article is displayed")
    public void articlePageDisplayed(String articleTitle) {
        boolean isArticleDisplayed = articlePage.isArticleDisplayed(articleTitle);
        Assert.assertTrue(isArticleDisplayed, articleTitle + " Article is not displayed");
    }
}
