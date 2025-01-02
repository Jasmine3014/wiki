package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ArticlePage extends Form {
    private final IButton toolMenu = getElementFactory().getButton(By.id("vector-page-tools-dropdown"), "Tool menu");
    private final IButton downloadAsPdf = getElementFactory().getButton(By.id("coll-download-as-rl"), "Download as PDF");
    private final IButton pageInfo = getElementFactory().getButton(By.id("t-info"), "Page information Button");
    private final ITextBox headingText = getElementFactory().getTextBox(By.id("firstHeading"), "Heading");

    public ArticlePage() {
        super(By.id("vector-toc"), "ArticlePage");
    }

    @Step("Click on the 'Tool menu'")
    public void clickOnToolMenu() {
        toolMenu.click();
    }

    @Step("Click on the 'Download as PDF' button")
    public void clickOnDownloadAsPdf() {
        downloadAsPdf.click();
    }

    @Step("Click on the 'Page information' button")
    public void clickOnPageInfo() {
        pageInfo.click();
    }

    @Step("Get the article header text'")
    public boolean isArticleDisplayed(String articleTitle) {
        return headingText.getText().equalsIgnoreCase(articleTitle);
    }
}
