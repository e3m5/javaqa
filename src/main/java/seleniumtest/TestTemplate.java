package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public abstract class TestTemplate {

    public WebDriver driver;
    public String page;

    @BeforeClass
    public void testSetUp() {
        driver = ChromeDriverSingleton.getChromeDriver();
    }
}