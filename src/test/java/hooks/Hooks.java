package hooks;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import io.cucumber.java.*;
import utils.EnvDataReader;

public class Hooks {
    private Browser browser = AqualityServices.getBrowser();

    @Before
    public void setUp() {
        browser = AqualityServices.getBrowser();
        browser.maximize();
        browser.goTo(EnvDataReader.getEnvData().getHost());
    }

    @After
    public void tearDown(){
        browser.quit();
    }
}
