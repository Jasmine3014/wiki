package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class InformationPage extends Form {
    private final ILabel headingText = getElementFactory().getLabel(By.id("firstHeading"), "Page Header");

    public InformationPage() {
        super(By.id("Basic_information"),"Basic Information Page");
    }

    @Step("Get the header text of the Article")
    public boolean isArticleDisplayed(String articleTitle) {
        return headingText.getText().contains(articleTitle);
    }
}
