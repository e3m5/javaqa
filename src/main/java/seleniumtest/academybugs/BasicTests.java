package seleniumtest.academybugs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import seleniumtest.TestTemplate;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BasicTests extends TestTemplate {

    @BeforeClass
    public void initPage() {
        page = "https://academybugs.com/find-bugs/";
    }

    //@Test(enabled = false)
    @Test
    public void openShop() {
        driver.get(page);
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Find Bugs – AcademyBugs.com");
    }

    //@Test(enabled = false)
    @Test()
    public void openShopFailing() {
        driver.get(page);
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Find Bugs – AcademyBugs.com wrong");
    }

    @Test
    public void getItems() {
        driver.get(page);

        List<WebElement> pagination = driver.findElements(By.xpath("//a[@class='what-we-offer-pagination-link']"));

        for (WebElement e : pagination) {
            e.click();
        }
    }
}