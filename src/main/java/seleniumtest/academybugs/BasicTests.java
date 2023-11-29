package seleniumtest.academybugs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import seleniumtest.TestTemplate;
import seleniumtest.ChromeDriverSingleton;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BasicTests extends TestTemplate {

    @BeforeClass
    public void setUp() {
        page = "https://academybugs.com/find-bugs/";
    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @Test(enabled = false)
    public void openShop() {
        WebDriver chrome = ChromeDriverSingleton.getChromeDriver();
        chrome.get(page);
    }



    @Test
    public void getItems() {
        WebDriver chrome = ChromeDriverSingleton.getChromeDriver();
        chrome.get(page);

        List<WebElement> pagination = chrome.findElements(By.xpath("//a[@class='what-we-offer-pagination-link']"));

        for (WebElement e : pagination) {
            e.click();
        }
    }
}