package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.testng.Assert;
import pages.DownloadPage;
import utils.FileUtils;

public class DownloadPageSteps {
    private final DownloadPage downloadPage = new DownloadPage();

    @When("I click the Download button on download page")
    public void downloadBtn() {
        downloadPage.clickDownloadBtn();
    }

    @Then("I verify that the PDF file is downloaded")
    public void checkFileExists() {
        String fileName = downloadPage.getFileName();
        Assert.assertTrue(FileUtils.isFileDownloaded(fileName), "Downloaded file does not exist");
    }
}
