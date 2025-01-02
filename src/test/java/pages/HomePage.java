package pages;

import aquality.selenium.core.elements.ElementState;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IComboBox;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import constants.Languages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class HomePage extends Form {
    private final ITextBox searchField = getElementFactory().getTextBox(By.id("searchInput"), "Search field");
    private final IButton searchBtn = getElementFactory().getButton(By.xpath("//button[@type='submit']"), "search button");
    private final IComboBox dropDwnLag = getElementFactory().getComboBox(By.id("searchLanguage"),"DropDown Language", ElementState.EXISTS_IN_ANY_STATE);

    public HomePage () {
        super(By.id("www-wikipedia-org"), "HomePage");
    }

    @Step("Type {string}")
    public void inputText(String text) {
        searchField.type(text);
    }

    @Step("click the search button")
    public void clickSearchBtn() {
        searchBtn.click();
    }

    @Step("Change the language to {string}")
    public void clickToChangeLanguage(Languages language) {
        dropDwnLag.selectByContainingValue(language.getLanguage());
    }
}
