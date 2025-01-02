package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class DownloadPage extends Form {
    private final IButton fileDwnld = getElementFactory().getButton(By.xpath("//button[@type='submit']"), "Download Button");
    private final ILabel fileNameElement = getElementFactory().getLabel(By.className("mw-electronpdfservice-selection-label-desc"), "File name");

    public DownloadPage() {
        super(By.className("mw-electronpdfservice-selection-body"), "Download Page");
    }

    @Step("Click the Download button on the download page")
    public void clickDownloadBtn() {
        fileDwnld.click();
    }

    @Step("Get the file Name")
    public String getFileName() {
        return fileNameElement.getText();
    }
}
